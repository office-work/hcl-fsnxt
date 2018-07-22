package org.arpit.com.redis.repository;

import java.util.Map;
import java.util.stream.Collectors;

import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepositoryImpl implements RedisRepository {

	private RedisTemplate<Long, ClientMaster> redisTemplate;

	private HashOperations hashOperations;

	public RedisRepositoryImpl(RedisTemplate<Long, ClientMaster> redisTemplate) {
		this.redisTemplate = redisTemplate;

		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(ClientMaster CLIENT_MASTER) {
		hashOperations.put("CLIENT_MASTER", CLIENT_MASTER.getId(), CLIENT_MASTER);
	}

	@Override
	public Map<Long, ClientMaster> findAll() {
		return hashOperations.entries("CLIENT_MASTER");
	}

	@Override
	public ClientMaster findById(Long id) {
		return (ClientMaster) hashOperations.get("CLIENT_MASTER", id);
	}

	@Override
	public void update(ClientMaster CLIENT_MASTER) {
		save(CLIENT_MASTER);
	}

	@Override
	public void delete(Long id) {

		hashOperations.delete("CLIENT_MASTER", id);
	}

	@Override
	public ClientMaster findByName(final String clientCode) {
		Map<Long, ClientMaster> allClientMasters = findAll();
		/*
		 * Map<Long, ClientMaster> clientMaster = allClientMasters.entrySet().stream()
		 * .filter(e -> (ClientMaster)
		 * e.getValue().getClientName().equalsIgnoreCase(name))
		 * .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		 */

		ClientMaster clientMaster = null;
		for (Map.Entry<Long, ClientMaster> entry : allClientMasters.entrySet()) {
			if (clientCode.equals(((ClientMaster)entry.getValue()).getClientCode())) {
				clientMaster = entry.getValue();
			}
		}
		return clientMaster;

	}
}

package org.arpit.com.redis.repository;
import java.util.Map;

import org.arpit.com.mastersetupapp.entity.ClientMaster;

public interface RedisRepository {

    void save(ClientMaster clientMaster);
    Map<Long, ClientMaster> findAll();
    ClientMaster findById(Long id);
    void update(ClientMaster user);
    void delete(Long id);
    ClientMaster findByName(String name);
}

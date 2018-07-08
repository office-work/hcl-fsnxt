package org.db.com.cache;

import org.db.com.model.Users;
import org.db.com.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UsersCache {

    @Autowired
    UsersRepository usersRepository;

    @Cacheable(value = "usersCache", key = "#id" , unless ="#result==null")
    public Users getUser(Long id) {
        System.out.println("Retrieving from Database for name: " + id);
        return usersRepository.findOne(id);
    }
    
    @CacheEvict(value = "usersCache" , key="#id")
    public void deleteUser(Long id) {
        System.out.println("user has been deleted from db.");
        usersRepository.delete(id);
    }
    
    @CachePut(value="usersCache", key ="#id" )
    public Users updateUser(Long id, String name) {
        System.out.println("user is updated in db");
        Users user = usersRepository.findOne(id);
        if(user != null) {
        	user.setName(name);
        	return user = usersRepository.save(user);
        }
        return user;
    }
    
}

package org.db.com.resource;

import org.db.com.cache.UsersCache;
import org.db.com.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersCache usersCache;

    @GetMapping(value = "/{id}")
    public Users getUser(@PathVariable final Long id) {
        return usersCache.getUser(id);
    }
    
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable final Long id) {
        usersCache.deleteUser(id);
    }
    
    @PutMapping(value = "/{id}/{name}")
    public Users updateUser(@PathVariable final Long id,@PathVariable final String name) {
        return usersCache.updateUser(id, name);
    }
    
}

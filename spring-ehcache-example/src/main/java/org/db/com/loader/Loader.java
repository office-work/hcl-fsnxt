package org.db.com.loader;

import org.db.com.model.Users;
import org.db.com.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
        List<Users> usersList = getList();
        usersRepository.save(usersList);
    }

    public List<Users> getList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Arpit", "Dev",123L));
        usersList.add(new Users("Vivek", "Dev",13L));
        usersList.add(new Users("Neeraj", "Dev",13L));
        usersList.add(new Users("Prashant", "Arc",13L));
        return usersList;
    }
}

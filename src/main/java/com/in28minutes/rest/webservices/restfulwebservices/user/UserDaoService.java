package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "Rahul", LocalDate.now().minusYears(25)));
        users.add(new User(2, "Rahi", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Satendra", LocalDate.now().minusYears(25)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findUser(Integer id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }
}

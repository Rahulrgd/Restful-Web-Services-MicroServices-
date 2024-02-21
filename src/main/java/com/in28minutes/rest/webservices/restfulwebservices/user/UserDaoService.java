package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private List<User> users = new ArrayList<>();

    static{
        new User(1, "Rahul", LocalDate.now().minusYears(25));
        new User(2, "Rahi", LocalDate.now().minusYears(25));
        new User(3, "Satendra", LocalDate.now().minusYears(25));
    }

    public List<User> findAll(){
        return users;
    }
}

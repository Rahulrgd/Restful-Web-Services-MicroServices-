package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    // @Autowired
    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }
    
    @GetMapping("users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
    
    @GetMapping("users/{id}")
    public User retrieveUser(@PathVariable Integer id){
        return service.findUser(id);
    }
}

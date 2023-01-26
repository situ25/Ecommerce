package com.retail.ecommerce.controllers;

import com.retail.ecommerce.Model.User;
import com.retail.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }

    @PutMapping("/put")
    public boolean putUser(@RequestBody User user){
        userService.putUser(user);
        return true;
    }
}

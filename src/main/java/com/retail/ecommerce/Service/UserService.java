package com.retail.ecommerce.Service;

import com.retail.ecommerce.Model.User;
import com.retail.ecommerce.Repository.UserRepository;
import com.retail.ecommerce.controllers.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(@PathVariable("id") int id){
        Optional<User> user= userRepository.findById(id);
        if(user.isPresent())
            return user.get();
        System.out.println("No user present by this ID");
        return null;
    }

    @PutMapping("/put")
    public boolean putUser(@RequestBody User user){
        userRepository.save(user);
        return true;
    }
}

package com.example.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //Autowired bascially doing work of constructor
    UserRepository userRepository;

    //it will create user
    User createUser(User user){
        userRepository.save(user);
        return user;
    }

    //it will get user
    List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    //getUser by ID
    User getUser(long id){
        User user = userRepository.findById(id).get();
        return user;
    }

    //Updating user

    User updateuser(User user){
        long id = user.getId();
        User oldUser = userRepository.findById(id).get();
        oldUser.setUsername(user.getUsername());
        oldUser.setPassword(user.getPassword());
        oldUser.setEmail(user.getEmail());
        userRepository.save(oldUser);
        return user;
    }

    User deleteUser(long id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        return user;
    }

}

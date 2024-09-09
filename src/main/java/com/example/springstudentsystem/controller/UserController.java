package com.example.springstudentsystem.controller;

import com.example.springstudentsystem.dto.UserDTO;
import com.example.springstudentsystem.entity.User;
import com.example.springstudentsystem.repository.UserRepository;
import com.example.springstudentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @PostMapping("/saveuser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
       return userService.saveUser(userDTO);

    }
    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteuser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }


}

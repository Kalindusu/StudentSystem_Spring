package com.example.springstudentsystem.service;

import com.example.springstudentsystem.dto.UserDTO;
import com.example.springstudentsystem.entity.User;
import com.example.springstudentsystem.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
   @Autowired
   private ModelMapper modelMapper;


//    modelMapper is an instance of the ModelMapper class. It's used to automatically convert (or map) the userDTO object into a User entity object.
//    userDTO is passed as the source object, and User.class tells ModelMapper that we want to convert it into a User entity.
//    This conversion is necessary because userDTO is a simpler object (containing data meant for communication), and we need to convert it to a User entity, which represents the actual data stored in the database.
    public UserDTO saveUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;



//        User.class tells ModelMapper that we want to convert it into a User entity.
    }

}

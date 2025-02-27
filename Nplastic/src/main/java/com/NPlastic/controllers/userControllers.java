package com.NPlastic.controllers;

import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import com.NPlastic.service.userService;
import com.NPlastic.service.userServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userControllers {

    @Autowired
    private userServiceImpl service;

    @PostMapping
    public  ResponseEntity<UserResponseDTO> criarUser(@RequestBody UserRequestDTO userRequestDTO) {

        if(userRequestDTO != null){

        return  ResponseEntity.ok().body( service.create(userRequestDTO));
        }
        return ResponseEntity.notFound().build();


    }


    
}

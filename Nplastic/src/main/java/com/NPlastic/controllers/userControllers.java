package com.NPlastic.controllers;

import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import com.NPlastic.service.userService;
import com.NPlastic.service.userServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userControllers {

    @Autowired
    private userServiceImpl service;

    @PostMapping
    public ResponseEntity<UserResponseDTO> criarUser(@RequestBody UserRequestDTO userRequestDTO) {

        if (userRequestDTO != null) {

            return ResponseEntity.ok().body(service.create(userRequestDTO));
        }
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/id")
    public ResponseEntity<UserResponseDTO> updateUSer(@RequestBody UserRequestDTO userRequestDTO, int id) {

        userRequestDTO.setId(id);
        if (userRequestDTO != null) {

            return ResponseEntity.ok().body(service.update(userRequestDTO));
        }

        return ResponseEntity.notFound().build();
      }
      @GetMapping
    public ResponseEntity <List<UserResponseDTO>> listarTodos(){

        return ResponseEntity.ok().body(service.ListarUser());
      }
    }


    

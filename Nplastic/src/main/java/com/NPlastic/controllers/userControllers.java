package com.NPlastic.controllers;

import com.NPlastic.dto.dtoUser.UserRequestDTO;
import com.NPlastic.dto.dtoUser.UserResponseDTO;
import com.NPlastic.service.ServiceUser.userServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userControllers {

    @Autowired
    private userServiceImpl service;

    @PostMapping
    public ResponseEntity<UserResponseDTO> criarUser(@RequestBody UserRequestDTO userRequestDTO) {

        if (userRequestDTO != null) {

            UserResponseDTO userResponseDTO = service.create(userRequestDTO);

            return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(userRequestDTO.getId())
                            .toUri())
                    .body(userResponseDTO);


    }
        return ResponseEntity.notFound().build();
}
        @PutMapping("/{id}")
        public ResponseEntity<UserResponseDTO> updateUSer (@RequestBody UserRequestDTO userRequestDTO,
        @PathVariable int id){

            userRequestDTO.setId(id);
            if (userRequestDTO != null) {

                return ResponseEntity.ok().body(service.update(userRequestDTO));
            }

            return ResponseEntity.notFound().build();
        }
        @GetMapping
        public ResponseEntity<List<UserResponseDTO>> listarTodos() {

            return ResponseEntity.ok().body(service.ListarUser());
        }

        @GetMapping("/{id}")
        public ResponseEntity<UserResponseDTO> buscarPorId (@PathVariable int id){

            return ResponseEntity.ok().body(service.BuscarPorID(id));
        }
        @DeleteMapping("/{id}")
        public void DeletarUSer ( @PathVariable int id){
            service.deletarUser(id);



    }
}




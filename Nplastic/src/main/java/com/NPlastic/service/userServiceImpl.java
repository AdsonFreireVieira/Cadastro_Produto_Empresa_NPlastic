package com.NPlastic.service;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import com.NPlastic.mapper.Usermapper;
import com.NPlastic.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements  userService{

    @Autowired
    private userRepository repository;


    private Usermapper usermapper;

    @Override
    public UserResponseDTO create(UserRequestDTO userRequestDTO) {
        User user  = usermapper.convertToUser(userRequestDTO);

        return  usermapper.convertToResponse(repository.save(user));
    }

    @Override
    public UserResponseDTO update(UserRequestDTO userRequestDTO) {

        User user = usermapper.convertToUser(userRequestDTO);

        return usermapper.convertToResponse(repository.save(user));
    }

    @Override
    public List<UserResponseDTO> ListarUser() {
        return usermapper.convertListResponse((List<User>) repository.findAll());
    }

    @Override
    public void deletarUser(int id) {
       repository.deleteById(id);
    }

    @Override
    public UserResponseDTO BuscarPorID(int id) {

        return usermapper.convertToResponse(repository.findById(id).orElse(null));
    }
}

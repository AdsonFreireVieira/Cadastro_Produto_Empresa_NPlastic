package com.NPlastic.service;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import com.NPlastic.mapper.Usermapper;
import com.NPlastic.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class userServiceImpl implements  userService{

    @Autowired
    private userRepository repository;



    @Override
    public UserResponseDTO create(UserRequestDTO userRequestDTO) {

        User user = Usermapper.INSTANCE.toUSer(userRequestDTO);

        return Usermapper.INSTANCE.toResponseDto(user);
    }

    @Override
    public UserResponseDTO update(UserRequestDTO userRequestDTO) {



        return null;
    }

    @Override
    public List<UserResponseDTO> ListarUser() {
        return null;
    }

    @Override
    public void deletarUser(int id) {
       repository.deleteById(id);
    }

    @Override
    public UserResponseDTO BuscarPorID(int id) {

        return null;
    }
}

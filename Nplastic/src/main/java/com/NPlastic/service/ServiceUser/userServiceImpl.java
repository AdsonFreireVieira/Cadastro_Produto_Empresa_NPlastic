package com.NPlastic.service.ServiceUser;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.dtoUser.UserRequestDTO;
import com.NPlastic.dto.dtoUser.UserResponseDTO;
import com.NPlastic.mapper.Usermapper;
import com.NPlastic.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class userServiceImpl implements userService {

    @Autowired
    private userRepository repository;



    @Override
    public UserResponseDTO create(UserRequestDTO userRequestDTO) {

        User user = Usermapper.INSTANCE.toUSer(userRequestDTO);

        return Usermapper.INSTANCE.toResponseDto(repository.save(user));
    }

    @Override
    public UserResponseDTO update(UserRequestDTO userRequestDTO) {

    User user = Usermapper.INSTANCE.toUSer(userRequestDTO);
        return Usermapper.INSTANCE.toResponseDto(repository.save(user));
    }

    @Override
    public List<UserResponseDTO> ListarUser() {
        return Usermapper.INSTANCE.toListResponseDto((List<User>) repository.findAll());
    }

    @Override
    public void deletarUser(int id) {
       repository.deleteById(id);
    }

    @Override
    public UserResponseDTO BuscarPorID(int id) {

        return Usermapper.INSTANCE.toResponseDto(repository.findById(id).orElse(null));
    }
}

package com.NPlastic.service;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;

import java.util.List;

public interface userService {

    public UserResponseDTO create(UserRequestDTO userRequestDTOer);

    public UserResponseDTO update(UserRequestDTO userRequestDTO);

    public List<UserResponseDTO> ListarUser();

    public void deletarUser(int id);

    public UserResponseDTO BuscarPorID(int id);
}

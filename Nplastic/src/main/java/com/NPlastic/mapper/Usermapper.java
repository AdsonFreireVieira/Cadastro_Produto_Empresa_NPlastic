package com.NPlastic.mapper;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface  Usermapper{

    Usermapper mapper = Mappers.getMapper(Usermapper.class);

    User convertToUser(UserRequestDTO userRequestDTO) ;

    UserResponseDTO convertToResponse(User user);

    List<UserResponseDTO>  convertListResponse(List<User> userList);
}

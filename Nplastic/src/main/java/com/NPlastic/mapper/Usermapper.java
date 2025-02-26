package com.NPlastic.mapper;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface  Usermapper {

        Usermapper  INSTANCE= Mappers.getMapper(Usermapper.class);

    User toUSer(UserRequestDTO userRequestDTO);

     UserResponseDTO toResponseDto(User user);

}
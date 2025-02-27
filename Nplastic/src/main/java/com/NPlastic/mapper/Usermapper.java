package com.NPlastic.mapper;

import com.NPlastic.Entity.User;
import com.NPlastic.dto.UserRequestDTO;
import com.NPlastic.dto.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.repository.query.parser.Part;


import java.util.List;

@Mapper(componentModel = "spring")
public interface  Usermapper {

        Usermapper  INSTANCE= Mappers.getMapper(Usermapper.class);

        @Mapping(source = "id",target = "id")
        @Mapping(source = "nome",target = "nome")
        @Mapping(source = "email",target = "email")
        @Mapping(source = "telefone",target = "telefone")
        @Mapping(source = "senha",target = "senha")
        @Mapping(source = "data",target = "data")
    User toUSer(UserRequestDTO userRequestDTO);

    @Mapping(source = "nome",target = "nome")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "telefone",target = "telefone")
    @Mapping(source = "senha",target = "senha")
    @Mapping(source = "data",target = "data")
     UserResponseDTO toResponseDto(User user);

}
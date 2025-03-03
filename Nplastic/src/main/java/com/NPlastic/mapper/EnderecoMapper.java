package com.NPlastic.mapper;

import com.NPlastic.Entity.Endereco;
import com.NPlastic.dto.dtoEndereco.EnderecoRequest;
import com.NPlastic.dto.dtoEndereco.EnderecoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {Usermapper.class})
public interface EnderecoMapper {

   EnderecoMapper INSTANCE =  Mappers.getMapper(EnderecoMapper.class);
    @Mapping(source = "id",target = "id")
    @Mapping(source = "numero",target = "numero")
    @Mapping(source = "cep",target = "cep")
    @Mapping(source = "cidade",target = "cidade")
    @Mapping(source = "bairro",target = "bairro")
    @Mapping(source = "user", target = "user")

    Endereco toEndereco(EnderecoRequest request);


    @Mapping(source = "numero",target = "numero")
    @Mapping(source = "cep",target = "cep")
    @Mapping(source = "cidade",target = "cidade")
    @Mapping(source = "bairro",target = "bairro")
    @Mapping(source = "user", target = "user")

    EnderecoResponse toResponse(Endereco endereco);
}

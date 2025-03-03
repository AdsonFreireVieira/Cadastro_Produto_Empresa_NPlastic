package com.NPlastic.service.ServiceEndereco;

import com.NPlastic.Entity.Endereco;
import com.NPlastic.dto.dtoEndereco.EnderecoRequest;
import com.NPlastic.dto.dtoEndereco.EnderecoResponse;

import java.util.List;

public class ServiceEnderecoImpl implements  IEndereco {
    @Override
    public EnderecoResponse CriarEndereco(EnderecoRequest request) {
        return null;
    }

    @Override
    public EnderecoResponse atualizarEndereco(EnderecoRequest request) {
        return null;
    }

    @Override
    public List<Endereco> listarEndereco() {
        return List.of();
    }

    @Override
    public Endereco BuscarPorId(int id) {
        return null;
    }

    @Override
    public void deletarEndereco() {

    }
}

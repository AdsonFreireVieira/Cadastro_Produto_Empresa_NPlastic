package com.NPlastic.service.ServiceEndereco;

import com.NPlastic.Entity.Endereco;
import com.NPlastic.dto.dtoEndereco.EnderecoRequest;
import com.NPlastic.dto.dtoEndereco.EnderecoResponse;

import java.util.List;

public interface IEndereco {

    public EnderecoResponse CriarEndereco(EnderecoRequest request);

    public EnderecoResponse atualizarEndereco(EnderecoRequest request);

    public List<Endereco> listarEndereco();

    public Endereco BuscarPorId( int id);

    public void deletarEndereco();
}

package com.NPlastic.service.ServiceEndereco;

import com.NPlastic.Entity.Endereco;

import java.util.List;

public interface IEndereco {

    public   CriarEndereco();

    public Endereco atualizarEndereco();

    public List<Endereco> listarEndereco();

    public Endereco BuscarPorId( int id);

    public void deletarEndereco();
}

package com.NPlastic.dto.dtoEndereco;

import com.NPlastic.Entity.Clientes;
import com.NPlastic.dto.dtoUser.ClientesRequestDTO;

public class EnderecoRequest {
    private Integer id;

    private String numero;

    private  int cep;

    private String cidade;

    private String Bairro;

    private String estado;

private ClientesRequestDTO clienteRequest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClientesRequestDTO getClienteRequest() {
        return clienteRequest;
    }

    public void setClienteRequest(ClientesRequestDTO clienteRequest) {
        this.clienteRequest = clienteRequest;
    }

    public EnderecoRequest() {
    }
}

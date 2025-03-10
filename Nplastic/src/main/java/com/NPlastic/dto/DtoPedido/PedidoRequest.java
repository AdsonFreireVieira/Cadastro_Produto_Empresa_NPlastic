package com.NPlastic.dto.DtoPedido;

import com.NPlastic.dto.ItensDto.Itens_Request;
import com.NPlastic.dto.dtoUser.ClientesRequestDTO;

import java.time.LocalDate;
import java.util.List;

public class PedidoRequest {

    private Integer id;

    private LocalDate data;

   private String status;

    private List<Itens_Request> itensRequestList;

    private ClientesRequestDTO clientesRequest;


    public PedidoRequest() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Itens_Request> getItensRequestList() {
        return itensRequestList;
    }

    public void setItensRequestList(List<Itens_Request> itensRequestList) {
        this.itensRequestList = itensRequestList;
    }


    public ClientesRequestDTO getClientesRequest() {
        return clientesRequest;
    }

    public void setClientesRequest(ClientesRequestDTO clientesRequest) {
        this.clientesRequest = clientesRequest;
    }

}

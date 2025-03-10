package com.NPlastic.dto.DtoPedido;

import com.NPlastic.dto.ItensDto.Itens_Request;
import com.NPlastic.dto.ItensDto.Itens_Response;
import com.NPlastic.dto.dtoUser.ClientesRequestDTO;
import com.NPlastic.dto.dtoUser.ClientesResponseDTO;

import java.time.LocalDate;
import java.util.List;

public class PedidoResponse {

    private LocalDate data;

    private String status;

    private List<Itens_Response> itensResponseList;

    private ClientesResponseDTO clientesResponse;


    public PedidoResponse(LocalDate data) {
        this.data = data;
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

    public List<Itens_Response> getItensResponseList() {
        return itensResponseList;
    }

    public void setItensResponseList(List<Itens_Response> itensResponseList) {
        this.itensResponseList = itensResponseList;
    }

    public ClientesResponseDTO getClientesResponse() {
        return clientesResponse;
    }

    public void setClientesResponse(ClientesResponseDTO clientesResponse) {
        this.clientesResponse = clientesResponse;
    }
}
package com.NPlastic.dto.DtoPedido;


import com.NPlastic.Entity.Clientes;
import com.NPlastic.Entity.Itens_Pedido;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class PedidoRequest {

    private Integer Id;

    private LocalDate data;

   private String status;


    private List<Itens_Pedido> itens;

    private Clientes clientes;

    public PedidoRequest() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public List<Itens_Pedido> getItens() {
        return itens;
    }

    public void setItens(List<Itens_Pedido> itens) {
        this.itens = itens;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
}

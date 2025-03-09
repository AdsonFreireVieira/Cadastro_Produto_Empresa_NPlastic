package com.NPlastic.dto.ItensDto;

import com.NPlastic.dto.DtoPedido.PedidoResponse;
import com.NPlastic.dto.dtoProduto.ProdutoResponse;

public class Itens_Response {


    private int quantidade;

    private int totalItens;

    private double valorItens;

    private ProdutoResponse produtoResponse;

    private PedidoResponse pedidoResponse;

    public Itens_Response() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(int totalItens) {
        this.totalItens = totalItens;
    }

    public double getValorItens() {
        return valorItens;
    }

    public void setValorItens(double valorItens) {
        this.valorItens = valorItens;
    }

    public ProdutoResponse getProdutoResponse() {
        return produtoResponse;
    }

    public void setProdutoResponse(ProdutoResponse produtoResponse) {
        this.produtoResponse = produtoResponse;
    }

    public PedidoResponse getPedidoResponse() {
        return pedidoResponse;
    }

    public void setPedidoResponse(PedidoResponse pedidoResponse) {
        this.pedidoResponse = pedidoResponse;
    }
}
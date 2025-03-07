package com.NPlastic.mapper;

import com.NPlastic.Entity.Itens_Pedido;
import com.NPlastic.Entity.Pedido;
import com.NPlastic.dto.DtoPedido.PedidoRequest;
import com.NPlastic.dto.ItensDto.Itens_Request;
import com.NPlastic.dto.ItensDto.Itens_Response;
import com.NPlastic.dto.dtoProduto.ProdutoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProdutoMapper.class, PedidoMapper.class})
public interface ItensMapper {
    @Mapping(source = "id_Itens", target = "id_Itens")
    @Mapping(source = "quantidade", target = "quantidade")
    @Mapping(source = "totalItens", target = "valorItens")
    @Mapping(source = "produto", target = "produto")
    @Mapping(source = "pedido", target = "pedido")



    Itens_Pedido convertToItens(Itens_Request itensRequest);

    @Mapping(source = "id_Itens", target = "id_Itens")
    @Mapping(source = "quantidade", target = "quantidade")
    @Mapping(source = "totalItens", target = "valorItens")
    @Mapping(source = "produto", target = "produto")
    @Mapping(source = "pedido", target = "pedido")

    Itens_Response convertToItensResponse(Itens_Pedido itensPedido);

    @Mapping(source = "quantidade", target = "quantidade")
    @Mapping(source = "totalItens", target = "valorItens")
    @Mapping(source = "produto", target = "produto")
    @Mapping(source = "pedido", target = "pedido")
    List<Itens_Response> convertToListResponse(List<Itens_Pedido> itens_pedidoList);
}

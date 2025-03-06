package com.NPlastic.controllers;

import com.NPlastic.dto.dtoProduto.ProdutoRequest;
import com.NPlastic.dto.dtoProduto.ProdutoResponse;
import com.NPlastic.service.serviceProduto.ServiceProdutoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoControllers {

    @Autowired
    private ServiceProdutoImpl service;

    @PostMapping
    public ResponseEntity<ProdutoResponse> criarProduto(@RequestBody ProdutoRequest request){

        ProdutoResponse response = service.criarProduto(request);

        if(response != null){
            return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(request.getId_Produto())
                    .toUri()).body(response);

        }
        return  ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> atualizaProduto(@RequestBody ProdutoRequest produtoRequest,
                                                           @PathVariable int id){
        produtoRequest.setId_Produto(id);

        if(produtoRequest != null) {
            return ResponseEntity.ok().body(service.AtualizaProduto(produtoRequest));
        }
        return ResponseEntity.notFound().build();

    }
    @GetMapping
    public ResponseEntity <List<ProdutoResponse>> listarProduto(){

        return ResponseEntity.ok().body(service.listarProdutos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse>buscarPorId(@PathVariable int id){

        return ResponseEntity.ok().body(service.buscarPorId(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deletarProduto(@PathVariable int id){

        return ResponseEntity.ok().body(service.deletarProduto(id));
    }
}














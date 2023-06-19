package com.example.api_crud_produtos.dtos;

import com.example.api_crud_produtos.entities.Produto;

import java.math.BigDecimal;

public record DetalharProdutoDto(String id, String nome, BigDecimal preco) {

    public DetalharProdutoDto(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getPreco());
    }
}

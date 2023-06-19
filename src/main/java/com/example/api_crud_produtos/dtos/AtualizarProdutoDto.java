package com.example.api_crud_produtos.dtos;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record AtualizarProdutoDto(@NotNull String id, String nome, BigDecimal preco) {
}

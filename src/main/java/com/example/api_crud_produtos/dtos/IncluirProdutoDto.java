package com.example.api_crud_produtos.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record IncluirProdutoDto(@NotBlank String nome, @NotNull BigDecimal preco) {
}

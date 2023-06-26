package com.example.api_crud_produtos.dtos;

import org.springframework.validation.FieldError;

public record ErrosValidacaoDto (String campo, String mensagem){

    public ErrosValidacaoDto(FieldError erro){
        this(erro.getField(), erro.getDefaultMessage());
    }

}

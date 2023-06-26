package com.example.api_crud_produtos.infra.exception;

public class ValidacaoException extends RuntimeException{

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}

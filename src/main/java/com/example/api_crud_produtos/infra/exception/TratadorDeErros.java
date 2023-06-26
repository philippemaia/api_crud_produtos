package com.example.api_crud_produtos.infra.exception;

import com.example.api_crud_produtos.dtos.ErrosValidacaoDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarErro404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException ex){
        var erros =ex.getFieldErrors();
        var errosValidacao = erros.stream().map(ErrosValidacaoDto::new).toList();

        return ResponseEntity.badRequest().body(errosValidacao);
    }

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity tratarErrosRegraDeNegocio(ValidacaoException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }


}

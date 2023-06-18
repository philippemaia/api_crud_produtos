package com.example.api_crud_produtos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity listarTodosProdutos(){
        return ResponseEntity.ok("OK");
    }
}

package com.example.api_crud_produtos.controllers;

import com.example.api_crud_produtos.dto.ProdutoDto;
import com.example.api_crud_produtos.entities.Produto;
import com.example.api_crud_produtos.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public ResponseEntity listarTodosProdutos(){
        var produtos = repository.findAll();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarProduto(@RequestBody @Valid ProdutoDto dto, UriComponentsBuilder uriBuilder){
        Produto produto = new Produto(dto);
        repository.save(produto);

        var uri = uriBuilder.path("/produtos/{id}").buildAndExpand(produto.getId()).toUri();

        return ResponseEntity.created(uri).body(new Produto(dto));
    }
}

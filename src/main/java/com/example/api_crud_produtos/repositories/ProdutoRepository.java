package com.example.api_crud_produtos.repositories;

import com.example.api_crud_produtos.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,String> {
}

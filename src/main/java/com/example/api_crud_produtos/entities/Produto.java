package com.example.api_crud_produtos.entities;

import com.example.api_crud_produtos.dtos.AtualizarProdutoDto;
import com.example.api_crud_produtos.dtos.IncluirProdutoDto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "produto")
@Table(name = "produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String nome;

    @Column
    private BigDecimal preco;

    public Produto(IncluirProdutoDto dto){
        this.nome = dto.nome();
        this.preco = dto.preco();
    }

    public void atualizarProduto(AtualizarProdutoDto dto) {
        if(dto.nome() != null) {
            this.nome = dto.nome();
        }
        if(dto.preco() != null) {
            this.preco = dto.preco();
        }
    }
}

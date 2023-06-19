package com.example.api_crud_produtos.entities;

import com.example.api_crud_produtos.dto.ProdutoDto;
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

    public Produto(ProdutoDto dto){
        this.nome = dto.nome();
        this.preco = dto.preco();
    }
}

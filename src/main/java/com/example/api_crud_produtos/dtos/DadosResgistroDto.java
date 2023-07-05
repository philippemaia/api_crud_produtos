package com.example.api_crud_produtos.dtos;

import com.example.api_crud_produtos.entities.PerfilUsuario;

public record DadosResgistroDto(String login, String senha, PerfilUsuario perfil) {
}

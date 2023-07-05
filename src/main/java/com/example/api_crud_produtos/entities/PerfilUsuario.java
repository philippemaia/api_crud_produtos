package com.example.api_crud_produtos.entities;

public enum PerfilUsuario {

    ADMIN("administrador"),
    USER("usuario");

    private String perfil;

    PerfilUsuario(String perfil) {
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }
}

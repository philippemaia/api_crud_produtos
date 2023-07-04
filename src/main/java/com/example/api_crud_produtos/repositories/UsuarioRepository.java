package com.example.api_crud_produtos.repositories;

import com.example.api_crud_produtos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    UserDetails findByLogin(String login);
}

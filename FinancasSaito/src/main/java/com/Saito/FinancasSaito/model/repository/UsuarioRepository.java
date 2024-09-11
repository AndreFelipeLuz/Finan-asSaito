package com.Saito.FinancasSaito.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Saito.FinancasSaito.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}

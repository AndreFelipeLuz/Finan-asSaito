package com.Saito.FinancasSaito.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Saito.FinancasSaito.model.entity.Lancamentos;

public interface LancamentosRepository extends JpaRepository<Lancamentos,Long>{
    
}

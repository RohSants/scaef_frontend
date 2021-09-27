package com.scaef.spring.repository;

import com.scaef.spring.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository <Medicamento, Integer> {
    
}
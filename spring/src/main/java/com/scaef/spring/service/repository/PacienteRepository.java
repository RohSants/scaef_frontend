package com.scaef.spring.service.repository;

import com.scaef.spring.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente, Integer> {
    
}
package com.scaef.spring.service;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.entity.Paciente;
import com.scaef.spring.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    private PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }
    
    public MessageResponseDTO create(Paciente paciente){
        Paciente savedPaciente = pacienteRepository.save(paciente);
        return MessageResponseDTO.builder().message("Paciente " + savedPaciente.getNome() + " cadastrado com a ID = " + savedPaciente.getId()).build(); 
    }
}
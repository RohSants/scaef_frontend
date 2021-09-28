package com.scaef.spring.service;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.PacienteDTO;
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
    
    /*--falta terminar a aula 22-- public MessageResponseDTO create(PacienteDTO pacienteDTO){
        Paciente savedPaciente = pacienteRepository.save(pacienteDTO);
        return MessageResponseDTO.builder().message("Paciente " + savedPaciente.getNome() + " cadastrado com a ID = " + savedPaciente.getId()).build(); 
    }*/
}
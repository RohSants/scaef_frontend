package com.scaef.spring.service;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.PacienteDTO;
import com.scaef.spring.entity.Paciente;
import com.scaef.spring.mapper.PacienteMapper;
import com.scaef.spring.service.repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private PacienteRepository pacienteRepository;


    private final PacienteMapper pacienteMapper = PacienteMapper.INSTANCE;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    public MessageResponseDTO create(PacienteDTO pacienteDTO){

        Paciente pacienteToSave = pacienteMapper.toModel(pacienteDTO);

        Paciente savedPaciente = pacienteRepository.save(pacienteToSave);
        return MessageResponseDTO.builder().message("Paciente " + savedPaciente.getNome() + " cadastrado com a ID = " + savedPaciente.getId()).build(); 
    }
}
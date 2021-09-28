package com.scaef.spring.controller;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.PacienteDTO;
import com.scaef.spring.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Paciente")
public class PacienteController {

    private PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }
    
    @PostMapping
        public MessageResponseDTO create(@RequestBody @Validated PacienteDTO pacienteDTO){
        return pacienteService.create(pacienteDTO);
    }
}


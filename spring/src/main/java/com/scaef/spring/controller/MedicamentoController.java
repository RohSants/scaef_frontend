package com.scaef.spring.controller;

import com.scaef.spring.dto.MedicamentoDTO;
import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/Medicamento")
public class MedicamentoController {
    private MedicamentoService medicamentoService;

    @Autowired
    public MedicamentoController(MedicamentoService medicamentoService){
        this.medicamentoService = medicamentoService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid MedicamentoDTO medicamentoDTO){ 
        return medicamentoService.create(medicamentoDTO);
    }
}


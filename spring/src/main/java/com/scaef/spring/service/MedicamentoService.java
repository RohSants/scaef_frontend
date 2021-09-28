package com.scaef.spring.service;

import com.scaef.spring.dto.MedicamentoDTO;
import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.entity.Medicamento;
import com.scaef.spring.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {
    
    private MedicamentoRepository medicamentoRepository;

    @Autowired
    public MedicamentoService(MedicamentoRepository medicamentoRepository){
        this.medicamentoRepository = medicamentoRepository;
        }

        public MessageResponseDTO create(MedicamentoDTO medicamentoDTO){ 

           Medicamento medicamentoToSave = Medicamento.builder()
           .nome(medicamentoDTO.getNome())
           .codigo(medicamentoDTO.getCodigo())
           .cid(medicamentoDTO.getCid())
           .mg(medicamentoDTO.getMg())
           .ml(medicamentoDTO.getMl())
           .build();

            Medicamento saveMedicamento = medicamentoRepository.save(medicamentoToSave);
            return MessageResponseDTO.builder()
            .message("Medicamento registrado com o código: " + saveMedicamento.getCodigo()).build();
        }


}
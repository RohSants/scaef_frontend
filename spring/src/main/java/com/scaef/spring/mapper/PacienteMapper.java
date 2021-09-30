package com.scaef.spring.mapper;

import com.scaef.spring.entity.Paciente;
import com.scaef.spring.dto.PacienteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PacienteMapper {

    PacienteMapper INSTANCE = Mappers.getMapper(PacienteMapper.class);

    Paciente toModel(PacienteDTO pacienteDTO);
}
package com.scaef.spring.mapper;
import com.scaef.spring.dto.MedicamentoDTO;
import com.scaef.spring.entity.Medicamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MedicamentoMapper {

    MedicamentoMapper INSTANCE = Mappers.getMapper(MedicamentoMapper.class);
    
    Medicamento toModel(MedicamentoDTO medicamentoDTO);

}
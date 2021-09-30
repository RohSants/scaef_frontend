package com.scaef.spring.mapper;

import com.scaef.spring.dto.MedicamentoDTO;
import com.scaef.spring.entity.Medicamento;
import com.scaef.spring.entity.Medicamento.MedicamentoBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-30T00:21:48-0400",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Oracle Corporation)"
)
public class MedicamentoMapperImpl implements MedicamentoMapper {

    @Override
    public Medicamento toModel(MedicamentoDTO medicamentoDTO) {
        if ( medicamentoDTO == null ) {
            return null;
        }

        MedicamentoBuilder medicamento = Medicamento.builder();

        medicamento.catReg( medicamentoDTO.getCatReg() );
        medicamento.cid( medicamentoDTO.getCid() );
        medicamento.classeT( medicamentoDTO.getClasseT() );
        medicamento.dose( medicamentoDTO.getDose() );
        medicamento.forma( medicamentoDTO.getForma() );
        medicamento.id( medicamentoDTO.getId() );
        medicamento.nome( medicamentoDTO.getNome() );
        medicamento.pcdt( medicamentoDTO.getPcdt() );
        medicamento.priA( medicamentoDTO.getPriA() );
        medicamento.via( medicamentoDTO.getVia() );

        return medicamento.build();
    }
}

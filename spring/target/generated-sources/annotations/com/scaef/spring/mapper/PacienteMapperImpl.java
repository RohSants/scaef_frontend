package com.scaef.spring.mapper;

import com.scaef.spring.dto.PacienteDTO;
import com.scaef.spring.entity.Paciente;
import com.scaef.spring.entity.Paciente.PacienteBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-30T00:22:12-0400",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Oracle Corporation)"
)
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public Paciente toModel(PacienteDTO pacienteDTO) {
        if ( pacienteDTO == null ) {
            return null;
        }

        PacienteBuilder paciente = Paciente.builder();

        paciente.celular( pacienteDTO.getCelular() );
        paciente.cep( pacienteDTO.getCep() );
        paciente.cns( pacienteDTO.getCns() );
        paciente.comp( pacienteDTO.getComp() );
        paciente.cpf( pacienteDTO.getCpf() );
        paciente.email( pacienteDTO.getEmail() );
        paciente.endr( pacienteDTO.getEndr() );
        paciente.fone( pacienteDTO.getFone() );
        paciente.id( pacienteDTO.getId() );
        paciente.mun( pacienteDTO.getMun() );
        paciente.nome( pacienteDTO.getNome() );
        paciente.num( pacienteDTO.getNum() );

        return paciente.build();
    }
}

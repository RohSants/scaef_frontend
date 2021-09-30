package com.scaef.spring.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;
import com.scaef.spring.dto.PacienteDTO;
import com.scaef.spring.entity.Paciente;

public class PacienteUtils {

    private static final Faker faker = Faker.instance();

    public static PacienteDTO createFakePacienteDTO() {
        return PacienteDTO.builder()
            .id(faker.number().randomDigit())
            .nome(faker.name().firstName())
            .cns(faker.numerify("###############"))
            .cpf(faker.numerify("###########"))
            .dNasc(faker.date().birthday())
            .email(faker.name().firstName())
            .mun(faker.name().firstName())
            .endr(faker.name().firstName()) 
            .comp(faker.name().firstName())
            .cep(faker.number().randomDigit())
            .num(faker.number().randomDigit())
            .celular(faker.number().randomDigit())
            .fone(faker.number().randomDigit())
            .build();
    }

    public static Paciente createFakePaciente() {
        return Paciente.builder()
            .id(faker.number().randomDigit())
            .nome(faker.name().firstName())
            .cns(faker.numerify("###############"))
            .cpf(faker.numerify("###########"))
            .dNasc(faker.date().birthday())
            .email(faker.name().firstName())
            .mun(faker.name().firstName())
            .endr(faker.name().firstName()) 
            .comp(faker.name().firstName())
            .cep(faker.number().randomDigit())
            .num(faker.number().randomDigit())
            .celular(faker.number().randomDigit())
            .fone(faker.number().randomDigit())
            .build();
    }

    public static Paciente createFakePacienteFrom (PacienteDTO pacienteDTO){
        return Paciente.builder()
            .id(pacienteDTO.getId())
            .nome(pacienteDTO.getNome())
            .cns(pacienteDTO.getCns())
            .cpf(pacienteDTO.getCpf())
            .dNasc(pacienteDTO.getDNasc())
            .email(pacienteDTO.getEmail())
            .mun(pacienteDTO.getMun())
            .endr(pacienteDTO.getEndr()) 
            .comp(pacienteDTO.getComp())
            .cep(pacienteDTO.getCep())
            .num(pacienteDTO.getNum())
            .celular(pacienteDTO.getCelular())
            .fone(pacienteDTO.getFone())
            .build();
    }

    public static String asJsonString(PacienteDTO pacienteDTO) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModules(new JavaTimeModule());

            return objectMapper.writeValueAsString(pacienteDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
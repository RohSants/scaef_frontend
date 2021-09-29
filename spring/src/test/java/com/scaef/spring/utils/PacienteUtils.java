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
            .id(faker.number().randomNumber())
            .nome((faker.name())
            .cpf(faker.number())
            .dNasc(faker.date().birthday())
            .email(faker.address())
            .mun(faker.name())
            .endr(faker.name()) 
            .comp(faker.name())
            /*.cep()
            .num()
            .celular()
            .fone()*/
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
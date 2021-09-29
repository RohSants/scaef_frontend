package com.scaef.spring.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;
import com.scaef.spring.dto.MedicamentoDTO;

public class MedicamentoUtils {
    
     private static final Faker faker = Faker.instance();

    public static MedicamentoDTO createFakeMedicamentoDTO() {
        return MedicamentoDTO.builder()
                .id(faker.idNumber())
                .nome(faker.name())
                .cid(faker.number().randomNumber())
                .catReg(faker.name())
                .pcdt(faker.name())
                .dose(faker.name())
                .forma(faker.name())
                .via(faker.name())
                .priA(faker.name())
                .classeT(faker.name())
                .build();
    }

    public static String asJsonString(MedicamentoDTO medicamentoDTO) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModules(new JavaTimeModule());

            return objectMapper.writeValueAsString(medicamentoDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
    }
}
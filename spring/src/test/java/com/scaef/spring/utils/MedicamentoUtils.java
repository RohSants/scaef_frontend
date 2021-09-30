package com.scaef.spring.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;
import com.scaef.spring.dto.MedicamentoDTO;
import com.scaef.spring.entity.Medicamento;

public class MedicamentoUtils {
    
     private static final Faker faker = Faker.instance();

    public static MedicamentoDTO createFakeMedicamentoDTO() {
        return MedicamentoDTO.builder()
                .id(faker.number().numberBetween(0, 100))
                .nome(faker.medical().medicineName())
                .cid(faker.numerify("M0###"))
                .catReg(faker.medical().medicineName())
                .pcdt(faker.medical().symptoms())
                .dose(faker.numerify("##mg"))
                .forma(faker.name().toString())
                .via(faker.name().firstName())
                .priA(faker.medical().toString())
                .classeT(faker.medical().toString())
                .build();
    }

    public static Medicamento createFakeMedicamento() {
        return Medicamento.builder()
                .id(faker.number().numberBetween(0, 100))
                .nome(faker.numerify("M0##"))
                .cid(faker.medical().diseaseName())
                .catReg(faker.medical().medicineName())
                .pcdt(faker.medical().symptoms())
                .dose(faker.numerify("##mg"))
                .forma(faker.name().toString())
                .via(faker.name().name())
                .priA(faker.medical().toString())
                .classeT(faker.medical().toString())
                .build();
    }

    public static Medicamento createFakeMedicamentoFrom(MedicamentoDTO medicamentoDTO) {
        return Medicamento.builder()
                .id(medicamentoDTO.getId())
                .nome(medicamentoDTO.getNome())
                .cid(medicamentoDTO.getCid())
                .catReg(medicamentoDTO.getCatReg())
                .pcdt(medicamentoDTO.getPcdt())
                .dose(medicamentoDTO.getDose())
                .forma(medicamentoDTO.getForma())
                .via(medicamentoDTO.getVia())
                .priA(medicamentoDTO.getPriA())
                .classeT(medicamentoDTO.getClasseT())
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

}
package com.scaef.spring.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MedicamentoDTO {

    @NotBlank
    @Size(max = 95)
    private String nome;

    @NotNull
    private int codigo;

    @NotNull
    private int mg;

    @NotNull
    private int ml;

    @NotBlank
    @Size(max = 5)
    private String cid;

    @Valid
    @NotNull
    private MedicamentoDTO medicamentoDTO;
}
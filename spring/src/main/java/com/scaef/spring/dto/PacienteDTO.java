package com.scaef.spring.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.github.javafaker.IdNumber;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDTO {
    @NotNull
    private int id;

    @NotBlank
    @Size(max = 95)
    private String nome;

    @NotBlank
    @Size(max = 15)
    private String cns;

    @NotBlank
    @Size(max = 11)
    private String cpf;
    
    @NotNull
    private Date dNasc;
    
    @NotBlank
    @Size(max = 95)
    private String email;
    
    @NotBlank
    @Size(max = 26)
    private String mun;
    
    @NotBlank
    @Size(max = 80)
    private String endr;
    
    @NotBlank
    @Size(max = 50)
    private String comp;
    
    @NotNull
    private int cep;
    
    @NotNull
    private int num;
    
    @NotNull
    private int celular;
    
    @NotNull
    private int fone;

    @Valid
    @NotNull
    private PacienteDTO pacienteDTO;
}
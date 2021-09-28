package com.scaef.spring.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    @NotNull
    private int id;

    @NotBlank
    @Size(max = 95)
    private String nome;

    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    @Size(max = 9)
    private String rg;
    
    @NotBlank
    @Size(max = 95)
    private String email;

    @NotNull
    private int celular;

    @NotNull
    private int fone;

    @NotBlank
    @Size(max = 20)
    private String funcao;

    @NotNull
    private int crf;
    
    @Valid
    @NotNull
    private UsuarioDTO usuarioDTO;
    
}
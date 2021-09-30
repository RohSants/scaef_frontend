package com.scaef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Medicamento")
    private int id;
 
    @Column(name = "Nome", nullable = false, unique = true)
    private String nome;
 
    @Column(name = "CID", nullable = false)
    private String cid;

    @Column(name = "Categoria Regulatória", nullable = false)
    private String catReg;

    @Column(name = "PCDT", nullable = false)
    private String pcdt;

    @Column(name = "Dosagem", nullable = false)
    private String dose;

    @Column(name = "Forma Farmacêutica", nullable = false)
    private String forma;

    @Column(name = "Via de Administração", nullable = false)
    private String via;

    @Column(name = "Princípio Ativo", nullable = false)
    private String priA;

    @Column(name = "Classe Terapêutica", nullable = false)
    private String classeT;

}

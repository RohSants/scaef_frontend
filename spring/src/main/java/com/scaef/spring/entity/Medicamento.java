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

    @Column(name = "Categoria Regulatória",nullable = true)
    private String catReg;

    @Column(name = "PCDT",nullable = true)
    private String pcdt;

    @Column(name = "Dosagem",nullable = true)
    private String dose;

    @Column(name = "Forma Farmacêutica",nullable = true)
    private String forma;

    @Column(name = "Via de Administração", nullable = true)
    private String via;

    @Column(name = "Princípio Ativo", nullable = true)
    private String priA;

    @Column(name = "Classe Terapêutica", nullable = true)
    private String classeT;

}

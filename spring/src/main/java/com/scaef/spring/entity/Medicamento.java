package com.scaef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
 
    @Column(nullable = false, unique = true)
    private String nome;
 
    @Column(nullable = false)
    private String cid;
 
    @Column(nullable = true)
    private int mg;
 
    @Column(nullable = true)
    private int ml;
}

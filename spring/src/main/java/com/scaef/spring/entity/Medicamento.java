package com.scaef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int codigo;
 
    @Column(nullable = false, unique = true)
    private string nome;
 
    @Column(nullable = false)
    private string cid;
 
    @Column(nullable = true)
    private int mg;
 
    @Column(nullable = true)
    private int ml;
    
}

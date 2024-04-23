package com.vizyon.api.appz.persistence.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class EmpresaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nit;
    private String razonSocial;
    private String representanteLegal;
    private Date fechaCreacion;


    @ManyToOne
    @JoinColumn(name = "IdMunicipioFk")
    private MunicipioEntity municipio;
    

}

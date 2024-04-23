package com.vizyon.api.appz.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class ProveedorEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nitProveedor;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdTipoPersona")
    private TipoPersonaEntity tipoPersona;

    @ManyToOne
    @JoinColumn(name = "IdMunicipioFk")
    private MunicipioEntity municipio;
}

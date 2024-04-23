package com.vizyon.api.appz.persistence.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_persona")
public class TipoPersonaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "tipoPersona")
    private List<ClienteEntity> clientes;

    @OneToMany(mappedBy = "tipoPersona")
    private List<ProveedorEntity> proveedores;

}

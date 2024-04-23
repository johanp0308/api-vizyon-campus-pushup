package com.vizyon.api.appz.persistence.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String IdCliente;
    private Date fechaRegistro;

    @OneToMany(mappedBy = "cliente")
    private List<OrdenEntity> ordenes;

    @OneToMany(mappedBy = "cliente")
    private List<VentasEntity> ventas;

    @ManyToOne
    @JoinColumn(name = "IdMunicipioFk")
    private MunicipioEntity municipio;

    @ManyToOne
    @JoinColumn(name = "IdTipoPersonaFk")
    private TipoPersonaEntity tipoPersona;


}

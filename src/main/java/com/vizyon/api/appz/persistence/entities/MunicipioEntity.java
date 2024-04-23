package com.vizyon.api.appz.persistence.entities;

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
@Table(name = "municipio")
public class MunicipioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdDepartamentoFk")
    private DepartamentoEntity departamento;

    @OneToMany(mappedBy = "municipio")
    private List<EmpresaEntity> empresas;

    @OneToMany(mappedBy = "municipio")
    private List<EmpleadoEntity> empleados;

    @OneToMany(mappedBy = "municipio")
    private List<ClienteEntity> clientes;

    @OneToMany(mappedBy = "municipio")
    private List<ProveedorEntity> proveedores;

}

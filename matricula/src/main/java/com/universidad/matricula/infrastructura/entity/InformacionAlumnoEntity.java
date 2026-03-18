package com.universidad.matricula.infrastructura.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "informacion-alumnos")
public class InformacionAlumnoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlumno;
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    private String genero;
    private String curp;
    @Column(name = "direccion_domicilio")
    private String direccionDomicilio;
    private String nss;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    private String matricula;
}

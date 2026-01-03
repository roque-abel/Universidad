package com.universidad.matricula.infrastructura.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "periodos_academicos")
public class PeriodoAcademicoEntity {
    private Long id;
    private String nombre; // Ej: "2025-1"
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo;
}

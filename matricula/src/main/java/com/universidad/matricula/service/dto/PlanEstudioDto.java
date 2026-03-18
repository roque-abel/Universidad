package com.universidad.matricula.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanEstudioDto {
    private Long id;
    private String nombre; // Ej: Ingeniería en Sistemas
    private String codigo; // IS-2025
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean EstadoPlan;
}

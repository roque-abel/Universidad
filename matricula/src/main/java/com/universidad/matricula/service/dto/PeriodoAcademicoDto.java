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
public class PeriodoAcademicoDto {
    private Long id;
    private String nombre; // Ej: "2025-1"
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo;
}

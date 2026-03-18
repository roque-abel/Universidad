package com.universidad.matricula.service.dto;

import com.universidad.matricula.infrastructura.enums.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InformacionAlumnoDto {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private GeneroEnum genero;
    private String curp;
    private String direccionDomicilio;
    private String nss;
    private LocalDate fechaNacimiento;
}

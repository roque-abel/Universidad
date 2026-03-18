package com.universidad.matricula.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InformacionAlumnoRequest {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellidoPaterno;
    @NotBlank
    private String apellidoMaterno;
    @NotBlank
    private String genero;
    @NotBlank
    @Pattern(
        regexp = "^[A-Z]{4}[0-9]{6}[HM][A-Z]{5}[A-Z0-9][0-9]$",
        message = "CURP inválida")
    private String curp;
    @NotBlank
    private String direccionDomicilio;
    @Pattern(regexp = "\\d{11}", message = "El NSS debe tener 11 dígitos")
    @NotBlank
    private String nss;
    @Past(message = "La fecha debe ser en el pasado")
    @NotBlank
    private LocalDate fechaNacimiento;
}

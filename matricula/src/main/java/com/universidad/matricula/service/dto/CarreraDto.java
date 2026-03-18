package com.universidad.matricula.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarreraDto {
    private Integer id;
    private String nombre;
    private String modalidad;
}

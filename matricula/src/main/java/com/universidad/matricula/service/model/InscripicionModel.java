package com.universidad.matricula.service.model;

import com.universidad.matricula.infrastructura.enums.EstatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InscripicionModel {
    private String matricula;
    private String nombre;
    private String apellidoParterno;
    private String apellidoMaterno;
    private LocalDate fechaInscripcion;
    private EstatusEnum estatus;
}

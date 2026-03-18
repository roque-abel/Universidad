package com.universidad.matricula.infrastructura.gateway;

import com.universidad.matricula.service.dto.InformacionAlumnoDto;

import java.io.IOException;

public interface ProsesorInterfaceGateWay {
    Boolean validarRequisitos(InformacionAlumnoDto dto);
    String generarMatricula(InformacionAlumnoDto dto) ;
}

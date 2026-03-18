package com.universidad.matricula.infrastructura.procesorinterface;

import com.universidad.matricula.service.dto.InformacionAlumnoDto;

public interface InscripcionRepository {
    InformacionAlumnoDto registrarAlumno(InformacionAlumnoDto dto);
}

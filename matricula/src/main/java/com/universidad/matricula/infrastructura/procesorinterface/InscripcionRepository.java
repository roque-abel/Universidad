package com.universidad.matricula.infrastructura.procesorinterface;

import com.universidad.matricula.service.dto.InformacionAlumnoDto;
import com.universidad.matricula.service.model.InscripicionModel;

public interface InscripcionRepository {
    InscripicionModel registrarAlumno(InformacionAlumnoDto dto, String matricula);
}

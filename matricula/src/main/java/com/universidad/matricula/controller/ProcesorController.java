package com.universidad.matricula.controller;

import com.universidad.matricula.controller.request.InformacionAlumnoRequest;
import com.universidad.matricula.service.ProcesorInscripcionService;
import com.universidad.matricula.service.dto.InformacionAlumnoDto;
import com.universidad.matricula.service.mapeo.MapeoService;
import com.universidad.matricula.service.model.InscripicionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcesorController {
    @Autowired
    private MapeoService mapeoService;
    @Autowired
    private ProcesorInscripcionService inscripcionService;

    public ResponseEntity<InscripicionModel> inscripcionAlumno(InformacionAlumnoRequest request) {
        InformacionAlumnoDto informacionAlumnoDto = this.mapeoService.informacionRequestToDTo(request);

        InscripicionModel inscripicionModel  = this.inscripcionService.incripcionAlumno(informacionAlumnoDto);
        return ResponseEntity.ok(inscripicionModel);
    }
}

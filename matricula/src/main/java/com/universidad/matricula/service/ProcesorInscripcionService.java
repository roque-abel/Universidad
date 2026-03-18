package com.universidad.matricula.service;

import com.universidad.matricula.infrastructura.gateway.ProsesorInterfaceGateWay;
import com.universidad.matricula.infrastructura.procesorinterface.InscripcionRepository;
import com.universidad.matricula.service.dto.InformacionAlumnoDto;
import com.universidad.matricula.service.model.InscripicionModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ProcesorInscripcionService {
    @Autowired
    private InscripcionRepository inscripcionRepository;
    @Autowired
    private ProsesorInterfaceGateWay httpProsesorGateway;

    public InscripicionModel incripcionAlumno(InformacionAlumnoDto dto){
        if(Objects.isNull(dto)){
            throw  new RuntimeException("no se aceptan nulos");
        }
        Boolean validado = this.httpProsesorGateway.validarRequisitos(dto);

        if(Objects.equals(validado, false)){
            throw new RuntimeException(" no cumple con los requisitos");
        }

            String matricula = this.httpProsesorGateway.generarMatricula(dto);


        


    }
}

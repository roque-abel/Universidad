package com.universidad.matricula.service.mapeo;

import com.universidad.matricula.controller.request.InformacionAlumnoRequest;
import com.universidad.matricula.infrastructura.enums.GeneroEnum;
import com.universidad.matricula.service.dto.InformacionAlumnoDto;

public class MapeoService {
    public InformacionAlumnoDto informacionRequestToDTo(InformacionAlumnoRequest request){
        GeneroEnum generoEnum = GeneroEnum.valueOf(request.getGenero());
      return   InformacionAlumnoDto.builder()
                .nombre(request.getNombre())
                .apellidoMaterno(request.getApellidoMaterno())
                .apellidoPaterno(request.getApellidoPaterno())
                .genero(generoEnum)
                .curp(request.getCurp())
                .direccionDomicilio(request.getDireccionDomicilio())
                .nss(request.getNss())
                .fechaNacimiento(request.getFechaNacimiento())
                .build();
    }
}

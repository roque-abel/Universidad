package com.universidad.matricula.infrastructura.mapeoRepository;

import com.universidad.matricula.infrastructura.entity.InformacionAlumnoEntity;
import com.universidad.matricula.infrastructura.enums.EstatusEnum;
import com.universidad.matricula.infrastructura.enums.GeneroEnum;
import com.universidad.matricula.service.dto.InformacionAlumnoDto;
import com.universidad.matricula.service.model.InscripicionModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MapeoRepo {

    public InformacionAlumnoEntity informacionAlumnoDtoToEntity(InformacionAlumnoDto dto, String matricula){
        GeneroEnum generoEnum = dto.getGenero();
        String genero = generoEnum.toString();
    return     InformacionAlumnoEntity.builder()
                .nombre(dto.getNombre())
                .apellidoPaterno(dto.getApellidoPaterno())
                .apellidoMaterno(dto.getApellidoMaterno())
                .genero(genero)
                .curp(dto.getCurp())
                .direccionDomicilio(dto.getDireccionDomicilio())
                .nss(dto.getNss())
                .fechaNacimiento(dto.getFechaNacimiento())
                .matricula(matricula)
                .build();
    }

    public InscripicionModel informacionAlumnoEntityToModel(InformacionAlumnoEntity entity){
        String estatus = "ACTIVO";
        EstatusEnum estatusEnum = EstatusEnum.valueOf(estatus);

       return InscripicionModel.builder()
                .matricula(entity.getMatricula())
                .nombre(entity.getNombre())
                .apellidoParterno(entity.getApellidoPaterno())
                .apellidoMaterno(entity.getApellidoMaterno())
                .fechaInscripcion(LocalDate.now())
                .estatus(estatusEnum)
                .build();
    }
}

package com.universidad.matricula.infrastructura.daorepository;

import com.universidad.matricula.infrastructura.entity.InformacionAlumnoEntity;
import com.universidad.matricula.infrastructura.jparepository.InscripcionRepositoryJpa;
import com.universidad.matricula.infrastructura.mapeoRepository.MapeoRepo;
import com.universidad.matricula.infrastructura.procesorinterface.InscripcionRepository;
import com.universidad.matricula.service.dto.InformacionAlumnoDto;
import com.universidad.matricula.service.model.InscripicionModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@NoArgsConstructor
public class DaoRepository implements InscripcionRepository {
    @Autowired
    private InscripcionRepositoryJpa inscripcionRepository;
    @Autowired
    private MapeoRepo mapeoRepo;

    @Override
    public InscripicionModel registrarAlumno(InformacionAlumnoDto dto, String matricula){
        InformacionAlumnoEntity informacionAlumno = this.mapeoRepo.informacionAlumnoDtoToEntity(dto,matricula);
        InformacionAlumnoEntity informacionAlumnoEntity = this.inscripcionRepository.save(informacionAlumno);
        InscripicionModel model = this.mapeoRepo.informacionAlumnoEntityToModel(informacionAlumnoEntity);
        return model;
    }
}

package com.universidad.matricula.infrastructura.jparepository;

import com.universidad.matricula.infrastructura.entity.InformacionAlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepositoryJpa  extends JpaRepository<InformacionAlumnoEntity, Long> {

}

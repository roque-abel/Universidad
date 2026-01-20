package com.universidad.matricula.infrastructura;

import com.universidad.matricula.infrastructura.entity.AlumnoEntity;
import com.universidad.matricula.infrastructura.entity.CarreraEntity;
import com.universidad.matricula.infrastructura.entity.PeriodoAcademicoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inscripciones")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fecha_inscripcion")
    private LocalDate fechaInscripcion;
    private Boolean estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id")
    private AlumnoEntity alumno ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrera_id")
    private CarreraEntity carrera;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "periodo_academico_id")
    private PeriodoAcademicoEntity periodoAcademico;

}

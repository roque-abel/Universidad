package com.universidad.matricula.infrastructura;

import com.universidad.matricula.infrastructura.entity.AlumnoEntity;
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
    private Double calificacion;
    @OneToMany(mappedBy = "inscripcion", cascade = CascadeType.ALL)
    private List<AlumnoEntity> alumnos = new ArrayList<>();

}

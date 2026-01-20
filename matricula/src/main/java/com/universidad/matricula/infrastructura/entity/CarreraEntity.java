package com.universidad.matricula.infrastructura.entity;

import com.universidad.matricula.infrastructura.Inscripcion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "carreras")
public class CarreraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String modalidad;
    @OneToMany(mappedBy = "carrea", cascade = CascadeType.ALL)
    private List<Inscripcion> inscripciones;
}

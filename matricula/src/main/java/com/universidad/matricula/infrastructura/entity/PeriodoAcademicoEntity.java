package com.universidad.matricula.infrastructura.entity;

import com.universidad.matricula.infrastructura.Inscripcion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "periodos_academicos")
public class PeriodoAcademicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // Ej: "2025-1"
    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;
    @Column(name = "fecha_fin")
    private LocalDate fechaFin;
    private boolean activo;
    @OneToMany(mappedBy = "periodo_academico", cascade = CascadeType.ALL)
    private List<Inscripcion> inscripciones;
}

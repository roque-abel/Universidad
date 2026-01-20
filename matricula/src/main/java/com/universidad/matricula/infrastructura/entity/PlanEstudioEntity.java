package com.universidad.matricula.infrastructura.entity;

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
@Table(name = "panes_estudio")
public class PlanEstudioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre; // Ej: Ingeniería en Sistemas

    @Column(nullable = false, unique = true)
    private String codigo; // IS-2025

    @OneToMany(mappedBy = "pan_estudio", cascade = CascadeType.ALL)
    private List<MateriaEntity> materias;
}

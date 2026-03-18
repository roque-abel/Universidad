package com.universidad.matricula.infrastructura.enums;

import java.util.Objects;

public enum GeneroEnum {
    MASCULINO(1), FEMENINO(2);

    private Integer genero;

    GeneroEnum(Integer genero) {
        this.genero = genero;
    }

    public int getGenero() {
        return genero;
    }

    public GeneroEnum valueOf(Integer genero) {
        for (GeneroEnum generoEnum : GeneroEnum.values()) {
            if (Objects.equals(genero, generoEnum.getGenero())) {
                return generoEnum;
            }
        }
        throw new IllegalArgumentException("No enum" + genero);
    }
}

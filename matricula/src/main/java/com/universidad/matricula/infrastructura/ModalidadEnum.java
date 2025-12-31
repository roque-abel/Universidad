package com.universidad.matricula.infrastructura;

import java.util.Objects;

public enum ModalidadEnum {
    PRESENCIAL(1), LINEA(2);

    private Integer modalidad;

    ModalidadEnum(Integer modalidad) {
        this.modalidad = modalidad;
    }

    public Integer getModalidad() {
        return modalidad;
    }

    public ModalidadEnum valueOf(ModalidadEnum modalidad) {
        for (ModalidadEnum modalidadEnum : ModalidadEnum.values()) {
            if (Objects.equals(modalidadEnum.getModalidad(), modalidadEnum)) {
                return modalidadEnum;
            }
        }
        throw new IllegalArgumentException("no enum" + modalidad);
    }
}

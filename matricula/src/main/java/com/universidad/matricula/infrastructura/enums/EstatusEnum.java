package com.universidad.matricula.infrastructura.enums;

import java.util.Objects;

public enum EstatusEnum {
    ACTIVO(1),INACTIVO(2);

    private Integer estatus;

    EstatusEnum(Integer estatus){
        this.estatus = estatus;
    }
    public int getEstatus(){
        return estatus;
    }

    public EstatusEnum valueOf(Integer estatus) {
        for (EstatusEnum estatusEnum : EstatusEnum.values()) {
            if (Objects.equals(estatus, estatusEnum.getEstatus())) {
                return estatusEnum;
            }
        }
        throw new IllegalArgumentException("No enum" + estatus);
    }
}


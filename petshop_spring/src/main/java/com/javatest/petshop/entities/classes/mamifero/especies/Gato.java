package com.javatest.petshop.entities.classes.mamifero.especies;

import com.javatest.petshop.entities.classes.mamifero.Mamifero;

public class Gato extends Mamifero {
    private Boolean canUseCatNip;

    public Boolean getCanUseCatNip() {
        return canUseCatNip;
    }

    public void setCanUseCatNip(Boolean canUseCatNip) {
        this.canUseCatNip = canUseCatNip;
    }

    public Gato(Long id, String name, Integer age, Double weight, Boolean isBreastfeeding, Boolean canUseCatNip) {
        super(id, name, age, weight, isBreastfeeding);
        this.canUseCatNip = canUseCatNip;
    }
}

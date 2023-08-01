package com.javatest.petshop.entities.classes.peixe.especies;

import com.javatest.petshop.entities.classes.peixe.Peixe;

public class Tubarao extends Peixe {
    private String toothColor;

    public String getToothColor() {
        return toothColor;
    }

    public void setToothColor(String toothColor) {
        this.toothColor = toothColor;
    }

    public Tubarao(Long id, String name, Integer age, Double weight, Boolean swimFast, String toothColor) {
        super(id, name, age, weight, swimFast);
        this.toothColor = toothColor;
    }
}
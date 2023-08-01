package com.javatest.petshop.entities.classes.peixe.especies;

import com.javatest.petshop.entities.classes.peixe.Peixe;

public class Dourado extends Peixe {
    private String finColor;

    public String getFinColor() {
        return finColor;
    }

    public void setFinColor(String finColor) {
        this.finColor = finColor;
    }

    public Dourado(Long id, String name, Integer age, Double weight, Boolean swimFast, String finColor) {
        super(id, name, age, weight, swimFast);
        this.finColor = finColor;
    }
}

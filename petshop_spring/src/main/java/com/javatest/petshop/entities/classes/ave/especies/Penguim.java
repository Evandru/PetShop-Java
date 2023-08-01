package com.javatest.petshop.entities.classes.ave.especies;

import com.javatest.petshop.entities.classes.ave.Ave;

public class Penguim extends Ave {
    private String bellyColor;

    public Penguim(Long id, String name, Integer age, Double weight, Double wingWidth, Boolean canFly, String bellyColor) {
        super(id, name, age, weight, wingWidth, canFly);
        this.bellyColor = bellyColor;
    }

    public String getBellyColor() {
        return bellyColor;
    }

    public void setBellyColor(String bellyColor) {
        this.bellyColor = bellyColor;
    }


}

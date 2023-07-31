package org.example.entities.classes.ave.especies;

import org.example.entities.classes.ave.Ave;

public class Pato extends Ave{
    private String beakColor;

    public Pato(Long id, String name, Integer age, Double weight, Double wingWidth, Boolean canFly, String beakColor) {
        super(id, name, age, weight, wingWidth, canFly);
        this.beakColor = beakColor;
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }


}

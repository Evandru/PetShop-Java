package com.javatest.petshop.entities.classes.ave.especies;

import com.javatest.petshop.entities.classes.ave.Ave;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
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

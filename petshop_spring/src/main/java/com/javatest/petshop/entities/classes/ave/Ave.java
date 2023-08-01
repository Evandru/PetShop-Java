package com.javatest.petshop.entities.classes.ave;

import com.javatest.petshop.entities.Animal;
import com.javatest.petshop.interfaces.Aereo;

public abstract class Ave extends Animal implements Aereo {
    private Double wingWidth;
    private Boolean canFly;

    @Override
    public void fly() {
        if (canFly)
        {
            System.out.println(super.getName() + " está voando.");
        }
        else {
            System.out.println(super.getName() + " não voa.");
        }
    }

    public Ave(Long id, String name, Integer age, Double weight, Double wingWidth, Boolean canFly) {
        super(id, name, age, weight);
        this.wingWidth = wingWidth;
        this.canFly = canFly;
    }

    public Double getWingWidth() {
        return wingWidth;
    }

    public void setWingWidth(Double wingWidth) {
        this.wingWidth = wingWidth;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }
}

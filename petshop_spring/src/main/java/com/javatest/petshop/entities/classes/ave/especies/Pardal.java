package com.javatest.petshop.entities.classes.ave.especies;

import com.javatest.petshop.entities.classes.ave.Ave;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Pardal extends Ave {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pardal(Long id, String name, Integer age, Double weight, Double wingWidth, Boolean canFly, String color) {
        super(id, name, age, weight, wingWidth, canFly);
        this.color = color;
    }

}

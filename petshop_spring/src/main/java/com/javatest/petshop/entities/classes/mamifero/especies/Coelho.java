package com.javatest.petshop.entities.classes.mamifero.especies;

import com.javatest.petshop.entities.classes.mamifero.Mamifero;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Coelho extends Mamifero {
    private String earColor;

    public String getEarColor() {
        return earColor;
    }

    public void setEarColor(String earColor) {
        this.earColor = earColor;
    }

    public Coelho(Long id, String name, Integer age, Double weight, Boolean isBreastfeeding, String earColor) {
        super(id, name, age, weight, isBreastfeeding);
        this.earColor = earColor;
    }
}

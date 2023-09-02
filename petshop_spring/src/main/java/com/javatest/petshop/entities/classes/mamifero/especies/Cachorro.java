package com.javatest.petshop.entities.classes.mamifero.especies;

import com.javatest.petshop.entities.classes.mamifero.Mamifero;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Cachorro extends Mamifero {
    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public Cachorro(Long id, String name, Integer age, Double weight, Boolean isBreastfeeding, String furColor) {
        super(id, name, age, weight, isBreastfeeding);
        this.furColor = furColor;
    }
}

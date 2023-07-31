package org.example.entities.classes.mamifero;

import org.example.entities.Animal;
import org.example.interfaces.Terrestre;

public abstract class Mamifero extends Animal implements Terrestre {
    private Boolean isBreastfeeding;

    void BreastFeed(){
        if (isBreastfeeding)
        {
            System.out.println(super.getName() + " está amamentando.");
        }
        else {
            System.out.println(super.getName() + " não está lactando.");
        }
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + " está andando.");
    }

    public Boolean getBreastfeeding() {
        return isBreastfeeding;
    }

    public void setBreastfeeding(Boolean breastfeeding) {
        isBreastfeeding = breastfeeding;
    }

    public Mamifero(Long id, String name, Integer age, Double weight, Boolean isBreastfeeding) {
        super(id, name, age, weight);
        this.isBreastfeeding = isBreastfeeding;
    }
}

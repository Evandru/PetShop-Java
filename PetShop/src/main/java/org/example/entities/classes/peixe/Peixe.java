package org.example.entities.classes.peixe;

import org.example.entities.Animal;
import org.example.interfaces.Maritimo;

public abstract class Peixe extends Animal implements Maritimo {
    private Boolean swimFast;

    public Peixe(Long id, String name, Integer age, Double weight, Boolean swimFast) {
        super(id, name, age, weight);
        this.swimFast = swimFast;
    }

    @Override
    public void swim() {
        if (swimFast)
        {
            System.out.println(super.getName() + " está nadando rápido.");
        }
        else {
            System.out.println(super.getName() + " está nadando.");
        }
    }

    public Boolean getSwimFast() {
        return swimFast;
    }

    public void setSwimFast(Boolean swimFast) {
        this.swimFast = swimFast;
    }
}

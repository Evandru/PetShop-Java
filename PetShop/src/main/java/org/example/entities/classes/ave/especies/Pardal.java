package org.example.entities.classes.ave.especies;

import org.example.entities.classes.ave.Ave;

public class Pardal extends Ave {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pardal(Double wingWidth, Boolean canFly, String color) {
        super(wingWidth, canFly);
        this.color = color;
    }

}

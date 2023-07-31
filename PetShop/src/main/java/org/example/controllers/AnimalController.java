package org.example.controllers;

import org.example.entities.Animal;
import org.example.entities.classes.ave.especies.Pardal;

public class AnimalController {
    public Pardal pardalInstantiate()
    {
        Pardal pardal = new Pardal(1L, "Piupiu", 2, 100.0, 1.0, true, "yellow");
        return pardal;
    }
}

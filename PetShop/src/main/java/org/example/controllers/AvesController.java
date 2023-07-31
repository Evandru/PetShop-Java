package org.example.controllers;

import org.example.entities.classes.ave.especies.Pardal;
import org.example.entities.classes.ave.especies.Pato;
import org.example.entities.classes.ave.especies.Penguim;

public class AvesController {
    public Pardal pardalInstantiate()
    {
        Pardal pardal = new Pardal(1L, "Piupiu", 2, 100.0, 1.0, true, "yellow");
        return pardal;
    }
    public Pato patoInstantiate()
    {
        Pato pato = new Pato(2L, "Quakua", 4, 555.5, 3.5, false, "black");
        return pato;
    }
    public Penguim penguimInstantiate()
    {
        Penguim penguim = new Penguim(3L, "Pingu", 1, 600.0, 2.3, false, "white");
        return penguim;
    }
}

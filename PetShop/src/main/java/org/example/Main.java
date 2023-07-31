package org.example;

import org.example.controllers.AnimalController;
import org.example.entities.classes.ave.especies.Pardal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DbConnection dbc = new DbConnection();
        try {
            var db = dbc.connection();
            AnimalController animalC = new AnimalController();
            Pardal pardal = animalC.pardalInstantiate();
            System.out.println(pardal);
            //PreparedStatement ps = db.prepareStatement("");
            //ResultSet rs = ps.executeQuery();
            //System.out.println(rs);
            db.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

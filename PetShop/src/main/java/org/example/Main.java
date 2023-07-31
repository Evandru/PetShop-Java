package org.example;

import org.example.controllers.AvesController;
import org.example.database.DbAves;
import org.example.database.DbConnection;
import org.example.entities.classes.ave.especies.Pardal;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DbConnection dbc = new DbConnection();
        try {
            var db = dbc.connection();

            AvesController avesC = new AvesController();
            Pardal pardal = avesC.pardalInstantiate();
            System.out.println(pardal);

            DbAves.CreatePardal(db, pardal);

            System.out.println(db.getSchema());

            db.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

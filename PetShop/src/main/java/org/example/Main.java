package org.example;

import org.example.controllers.AvesController;
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

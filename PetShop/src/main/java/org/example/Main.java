package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DbConnection dbc = new DbConnection();
        try {
            var db = dbc.connection();
            PreparedStatement ps = db.prepareStatement("");
            ResultSet rs = ps.executeQuery();
            System.out.println(rs);
            db.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

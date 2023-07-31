package org.example.database;

import com.sun.source.tree.TryTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "postgre123";
    Connection conn;

    public Connection connection()
    {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return conn;
    }
}

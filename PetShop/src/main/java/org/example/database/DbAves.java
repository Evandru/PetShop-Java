package org.example.database;

import org.example.entities.classes.ave.especies.Pardal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbAves {
    public static void TableCreate(Connection conn) throws SQLException {
        conn.beginRequest();
        PreparedStatement ps = conn.prepareStatement("CREATE TABLE tb_aves(" +
                "id int, " +
                "name varchar(255), " +
                "age int, " +
                "weight float(2), " +
                "wingWeight float(2), " +
                "canFly boolean, " +
                "color varchar(255));");
        ResultSet rs = ps.executeQuery();
        System.out.println(rs);
        conn.commit();
        System.out.println("Table Aves criada!");
    }
    public static void DeleteTable(Connection conn) throws SQLException{
        conn.beginRequest();
        PreparedStatement ps = conn.prepareStatement("DROP TABLE tb_aves;");
        ResultSet rs = ps.executeQuery();
        System.out.println(rs);
        conn.commit();
        System.out.println("Table Aves deletada!");
    }

    public static void CreatePardal(Connection conn, Pardal pardal) throws SQLException {
        conn.beginRequest();
        PreparedStatement ps = conn.prepareStatement(String.format("INSERT INTO tb_aves VALUES (%d, %s, %d, %.2f, %.2f, %s, %s);",
                pardal.getId(), pardal.getName(), pardal.getAge(), pardal.getWeight(), pardal.getWingWidth(), pardal.getCanFly().toString(), pardal.getColor()));
        ResultSet rs = ps.executeQuery();
        System.out.println(rs);
        conn.commit();
        System.out.println(pardal.getName() + " inserido na tabela tb_aves!");
    }
}

package com.example.etlap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EtlapDB {
    Connection conn;

    public EtlapDB() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/etlapdb", "root", "");
    }

    public List<Etlap> getEtlapok() throws SQLException {
        List<Etlap> etlapok = new ArrayList<>();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM etlap;";
        ResultSet result = stmt.getResultSet();
        while (result.next()){

        }
        return etlapok;
    }

}

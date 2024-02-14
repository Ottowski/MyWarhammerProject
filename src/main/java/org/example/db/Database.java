package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    Connection connection = null;
    private static Database instance = null;

    public Connection connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/warhammer?user=root&password=Ottowski94&serverTimezone=UTC");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return connection;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
package org.example.dao;
import org.example.entity.OrksPistolEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrksPistolDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries
    private static final String INSERT_QUERY = "INSERT INTO orkspistol (name, range, attacks, D3OrD6Attacks, " +
            "ballisticSkill, strength, armorpenetration, damage, D3OrD6Damage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void insertAstartesPistol(OrksPistolEntity orksPistol) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1, orksPistol.getName());
            preparedStatement.setInt(2, orksPistol.getRange());
            preparedStatement.setInt(3, orksPistol.getAttacks());
            preparedStatement.setInt(4, orksPistol.getD3OrD6Attacks());
            preparedStatement.setInt(5, orksPistol.getBallisticSkill());
            preparedStatement.setInt(6, orksPistol.getStrength());
            preparedStatement.setInt(7, orksPistol.getArmorpenetration());
            preparedStatement.setInt(8, orksPistol.getDamage());
            preparedStatement.setInt(9, orksPistol.getD3OrD6Damage());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connections
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

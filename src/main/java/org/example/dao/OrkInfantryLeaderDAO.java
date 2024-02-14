package org.example.dao;
import org.example.entity.OrkInfantryLeaderEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrkInfantryLeaderDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries
    private static final String INSERT_QUERY = "INSERT INTO orkinfantryleader (unitName, movement, toughness, " +
            "wounds, save, meleeWeapon, rangedWeapon, pistol, specialUnitRangedWeapon) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void insertOrkInfantryLeader(OrkInfantryLeaderEntity orkInfantryLeader) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1, orkInfantryLeader.getName());
            preparedStatement.setInt(2, orkInfantryLeader.getMovement());
            preparedStatement.setInt(3, orkInfantryLeader.getToughness());
            preparedStatement.setInt(4, orkInfantryLeader.getWounds());
            preparedStatement.setInt(5, orkInfantryLeader.getSave());
            preparedStatement.setInt(6, orkInfantryLeader.getMeleeWeapon());
            preparedStatement.setInt(7, orkInfantryLeader.getRangedWeapon());
            preparedStatement.setInt(8, orkInfantryLeader.getPistol());
            preparedStatement.setInt(8, orkInfantryLeader.getSpecialUnitRangedWeapon());
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
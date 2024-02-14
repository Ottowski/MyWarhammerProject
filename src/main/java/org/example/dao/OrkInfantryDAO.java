package org.example.dao;
import org.example.entity.OrkInfantryEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrkInfantryDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries
    private static final String INSERT_QUERY = "INSERT INTO orkinfantry (unitName, unitLeader, unitSize, movement, toughness, " +
            "wounds, save, meleeWeapon, rangedWeapon, pistol, specialUnitRangedWeapon) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void insertOrkInfantry(OrkInfantryEntity orkInfantry) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1, orkInfantry.getUnitName());
            preparedStatement.setInt(2, orkInfantry.getUnitLeader());
            preparedStatement.setInt(2, orkInfantry.getUnitSize());
            preparedStatement.setInt(2, orkInfantry.getMovement());
            preparedStatement.setInt(3, orkInfantry.getToughness());
            preparedStatement.setInt(4, orkInfantry.getWounds());
            preparedStatement.setInt(5, orkInfantry.getSave());
            preparedStatement.setInt(6, orkInfantry.getMeleeWeapon());
            preparedStatement.setInt(7, orkInfantry.getRangedWeapon());
            preparedStatement.setInt(8, orkInfantry.getPistol());
            preparedStatement.setInt(8, orkInfantry.getSpecialUnitRangedWeapon());
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

package org.example.dao;
import org.example.entity.AstartesInfantryEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AstartesInfantryDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries
    private static final String INSERT_QUERY = "INSERT INTO astartesinfantry (unitName, unitLeader, movement, toughness, " +
            "wounds, save, meleeWeapon, rangedWeapon, pistol) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void insertAstartesInfantry(AstartesInfantryEntity astartesInfantry) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1, astartesInfantry.getUnitName());
            preparedStatement.setString(1, String.valueOf(astartesInfantry.getUnitLeader()));
            preparedStatement.setInt(2, astartesInfantry.getMovement());
            preparedStatement.setInt(3, astartesInfantry.getToughness());
            preparedStatement.setInt(4, astartesInfantry.getWounds());
            preparedStatement.setInt(5, astartesInfantry.getSave());
            preparedStatement.setInt(6, astartesInfantry.getMeleeWeapon());
            preparedStatement.setInt(7, astartesInfantry.getRangedWeapon());
            preparedStatement.setInt(8, astartesInfantry.getPistol());
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
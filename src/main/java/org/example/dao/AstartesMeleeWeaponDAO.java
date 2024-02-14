package org.example.dao;
import org.example.entity.AstartesMeleeWeaponEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AstartesMeleeWeaponDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries
    private static final String INSERT_QUERY = "INSERT INTO astartesmeleeweapon (name, attacks, D3OrD6Attacks, " +
            "weaponSkill, strength, armorpenetration, damage, D3OrD6Damage) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    public void insertAstartesMeleeWeapon(AstartesMeleeWeaponEntity astartesMeleeWeapon) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1, astartesMeleeWeapon.getName());
            preparedStatement.setInt(2, astartesMeleeWeapon.getAttacks());
            preparedStatement.setInt(3, astartesMeleeWeapon.getD3OrD6Attacks());
            preparedStatement.setInt(4, astartesMeleeWeapon.getWeaponSkill());
            preparedStatement.setInt(5, astartesMeleeWeapon.getStrength());
            preparedStatement.setInt(6, astartesMeleeWeapon.getArmorpenetration());
            preparedStatement.setInt(7, astartesMeleeWeapon.getDamage());
            preparedStatement.setInt(8, astartesMeleeWeapon.getD3OrD6Damage());
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

package org.example.repository.pistolrepo;

import org.example.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PistolRepositoryImplement implements PistolRepository {
    private Database db = new Database();
    private Connection connection = db.connectToDatabase();

    @Override
    public PistolEntity get(Long id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String selectQuery = "SELECT * FROM pistol WHERE id = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return buildPistolEntity(resultSet);
            }
        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        } finally {
            closeResources(preparedStatement, resultSet);
        }
        return null;
    }

    @Override
    public void add(PistolEntity pistolentity) {
        PreparedStatement preparedStatement = null;
        try {
            String insertQuery = "INSERT INTO pistol (name, range, attacks, ballisticSkill, strength, armorpenetration, damage) VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, pistolentity.getName());
            preparedStatement.setInt(2, pistolentity.getRange());
            preparedStatement.setInt(3, pistolentity.getAttacks());
            preparedStatement.setInt(4, pistolentity.getBallisticSkill());
            preparedStatement.setInt(5, pistolentity.getStrength());
            preparedStatement.setInt(6, pistolentity.getArmorpenetration());
            preparedStatement.setInt(7, pistolentity.getDamage());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        } finally {
            closeResources(preparedStatement, null);
        }
    }

    @Override
    public void update(PistolEntity pistolentity) {
        PreparedStatement preparedStatement = null;
        try {
            String updateQuery = "UPDATE pistol SET name = ?, range = ?, attacks = ?, ballisticSkill = ?, strength = ?, armorpenetration = ?, damage = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setLong(1, pistolentity.getId());
            preparedStatement.setString(2, pistolentity.getName());
            preparedStatement.setInt(3, pistolentity.getRange());
            preparedStatement.setInt(4, pistolentity.getAttacks());
            preparedStatement.setInt(5, pistolentity.getBallisticSkill());
            preparedStatement.setInt(6, pistolentity.getStrength());
            preparedStatement.setInt(7, pistolentity.getArmorpenetration());
            preparedStatement.setInt(8, pistolentity.getDamage());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        } finally {
            closeResources(preparedStatement, null);
        }
    }

    @Override
    public void remove(PistolEntity pistolentity) {
        PreparedStatement preparedStatement = null;
        try {
            String deleteQuery = "DELETE FROM pistol WHERE id = ?";
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setLong(1, pistolentity.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        } finally {
            closeResources(preparedStatement, null);
        }
    }

    @Override
    public List<PistolEntity> getAllPistol() {
        List<PistolEntity> pistols = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String selectQuery = "SELECT * FROM pistol";
            preparedStatement = connection.prepareStatement(selectQuery);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                pistols.add(buildPistolEntity(resultSet));
            }
        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        } finally {
            closeResources(preparedStatement, resultSet);
        }
        return pistols;
    }

    private PistolEntity buildPistolEntity(ResultSet resultSet) throws SQLException {
        return PistolEntity.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .range(resultSet.getInt("range"))
                .attacks(resultSet.getInt("attacks"))
                .ballisticSkill(resultSet.getInt("ballisticSkill"))
                .strength(resultSet.getInt("strength"))
                .armorpenetration(resultSet.getInt("armorpenetration"))
                .damage(resultSet.getInt("damage"))
                .build();
    }

    private void closeResources(PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package org.example.dao;
import org.example.entity.AstartesMeleeWeaponEntity;
import org.example.coreProfileWeaponStats.ATTACKS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AstartesMeleeWeaponDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true&rewriteBatchedStatements=true&autoReconnect=true&failOverReadOnly=false&maxReconnects=10&connectTimeout=30000&socketTimeout=30000&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useConfigs=maxPerformance&sessionVariables=time_zone='+00:00'&useAffectedRows=true&zeroDateTimeBehavior=CONVERT_TO_NULL&autoDeserialize=true&tcpKeepAlive=true&useLocalSessionState=true&useLocalTransactionState=true&clientInfoCacheSize=33554432&clientCachePreparedStatements=true&alwaysSendSetIsolation=false&cacheCallableStmts=true&cachePrepStmts=true&cacheResultSetMetadata=true&maintainTimeStats=false&maintainStmtStats=false&neverRefCursorForGetGeneratedKeys=true&allowLoadLocalInfile=true&allowUrlInLocalInfile=true&alwaysSendMultipartHeader=true&connectUrl='jdbc:mysql://127.0.0.1:3306/New Warhammer Database/warhammer'";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;
    // SQL queries
    private static final String INSERT_QUERY = "INSERT INTO astartesmeleeweapon (meleeWeaponName, attacks, D3OrD6Attacks, " +
            "weaponSkill, strength, armorpenetration, damage, D3OrD6Damage) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public void insertAstartesMeleeWeapon(AstartesMeleeWeaponEntity astartesMeleeWeapon) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setInt(1, astartesMeleeWeapon.getId());
            preparedStatement.setString(2, astartesMeleeWeapon.getMeleeWeaponName());
            preparedStatement.setInt(3, astartesMeleeWeapon.getAttacks().getAttacks());
            preparedStatement.setInt(4, astartesMeleeWeapon.getD3OrD6Attacks().getD3OrD6Attacks());
            preparedStatement.setInt(5, astartesMeleeWeapon.getWeaponSkill().getWeaponSkill());
            preparedStatement.setInt(6, astartesMeleeWeapon.getStrength().getStrength());
            preparedStatement.setInt(7, astartesMeleeWeapon.getArmorpenetration().getArmorpenetration());
            preparedStatement.setInt(8, astartesMeleeWeapon.getDamage().getDamage());
            preparedStatement.setInt(9, astartesMeleeWeapon.getD3OrD6Damage().getD3OrD6Damage());
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
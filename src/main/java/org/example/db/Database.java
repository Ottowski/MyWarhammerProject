package org.example.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Database {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/New Warhammer Database?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true&rewriteBatchedStatements=true&autoReconnect=true&failOverReadOnly=false&maxReconnects=10&connectTimeout=30000&socketTimeout=30000&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useConfigs=maxPerformance&sessionVariables=time_zone='+00:00'&useAffectedRows=true&zeroDateTimeBehavior=CONVERT_TO_NULL&autoDeserialize=true&tcpKeepAlive=true&useLocalSessionState=true&useLocalTransactionState=true&clientInfoCacheSize=33554432&clientCachePreparedStatements=true&alwaysSendSetIsolation=false&cacheCallableStmts=true&cachePrepStmts=true&cacheResultSetMetadata=true&maintainTimeStats=false&maintainStmtStats=false&neverRefCursorForGetGeneratedKeys=true&allowLoadLocalInfile=true&allowUrlInLocalInfile=true&alwaysSendMultipartHeader=true&connectUrl='jdbc:mysql://127.0.0.1:3306/New Warhammer Database/warhammer'";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Database instance = null;
    public Connection connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/New Warhammer Database?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true&rewriteBatchedStatements=true&autoReconnect=true&failOverReadOnly=false&maxReconnects=10&connectTimeout=30000&socketTimeout=30000&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useConfigs=maxPerformance&sessionVariables=time_zone='+00:00'&useAffectedRows=true&zeroDateTimeBehavior=CONVERT_TO_NULL&autoDeserialize=true&tcpKeepAlive=true&useLocalSessionState=true&useLocalTransactionState=true&clientInfoCacheSize=33554432&clientCachePreparedStatements=true&alwaysSendSetIsolation=false&cacheCallableStmts=true&cachePrepStmts=true&cacheResultSetMetadata=true&maintainTimeStats=false&maintainStmtStats=false&neverRefCursorForGetGeneratedKeys=true&allowLoadLocalInfile=true&allowUrlInLocalInfile=true&alwaysSendMultipartHeader=true&connectUrl='jdbc:mysql://127.0.0.1:3306/New Warhammer Database/warhammer'");

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
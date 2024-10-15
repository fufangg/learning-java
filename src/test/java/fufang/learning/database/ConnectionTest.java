package fufang.learning.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class demonstrates a basic database connection test using MySQL.
 * It registers the driver and tests if the connection is successful.
 */
public class ConnectionTest {

    @BeforeAll
    static void registerDriver() {
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        } catch (SQLException e) {
            // Fail the test if driver registration fails
            Assertions.fail("Failed to register MySQL driver", e);
        }
    }

    @Test
    void testConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/database_learning?serverTimezone=Asia/Jakarta";
        String username = "root";
        String password = "Pass1234"; // change configuration match your local mysql password

        // Use try-with-resources to automatically close the connection
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            Assertions.assertNotNull(connection, "Connection should not be null");
            System.out.println("Successfully connected to the database");
        } catch (SQLException e) {
            // Fail the test if any SQL exception occurs
            Assertions.fail("Failed to connect to the database", e);
        }
    }
}

package fufang.learning.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * This class tests HikariCP connection pooling and database connection.
 */
public class ConnectionPoolTest {

    /**
     * Tests HikariCP connection pool setup and validates connections.
     */
    @Test
    void testHikariCP() {
        HikariConfig config = getHikariConfig();

        // Try-with-resources to ensure closing the datasource properly
        try (HikariDataSource dataSource = new HikariDataSource(config)) {
            // Obtain connection from the pool and ensure it's valid
            try (Connection connection = dataSource.getConnection()) {
                Assertions.assertNotNull(connection, "Connection should not be null");
                System.out.println("Successfully obtained a connection from HikariCP");
            }
        } catch (SQLException e) {
            Assertions.fail("Failed to obtain connection from HikariCP", e);
        }
    }

    private static @NotNull HikariConfig getHikariConfig() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/database_learning?serverTimezone=Asia/Jakarta");
        config.setUsername("root");
        config.setPassword("Pass1234");

        // Connection pool configuration
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);  // 60 seconds
        config.setMaxLifetime(10 * 60_000);  // 10 minutes
        return config;
    }

    /**
     * Tests retrieving a connection from a DataSource object (assuming DatabaseConnection is a utility class).
     */
    @Test
    void testDatabaseConnection() {
        try (Connection connection = DatabaseConnection.getDataSource().getConnection()) {
            Assertions.assertNotNull(connection, "Connection should not be null");
            System.out.println("Successfully connected to the database");
        } catch (SQLException e) {
            Assertions.fail("Failed to obtain connection from the DataSource", e);
        }
    }
}

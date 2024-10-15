package fufang.learning.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * DatabaseConnection class manages the HikariCP connection pool for the application.
 */
public class DatabaseConnection {
    private static HikariDataSource dataSource;

    // Static block for initializing the HikariCP datasource
    static {
        try {
            HikariConfig config = new HikariConfig();
            config.setDriverClassName("com.mysql.cj.jdbc.Driver");
            config.setJdbcUrl("jdbc:mysql://localhost:3306/database_learning?serverTimezone=Asia/Jakarta");
            config.setUsername("root");
            config.setPassword("Pass1234");

            // Pool configuration
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(5);
            config.setIdleTimeout(60_000);  // 60 seconds
            config.setMaxLifetime(10 * 60_000);  // 10 minutes

            // Initialize the data source
            dataSource = new HikariDataSource(config);

            // Add shutdown hook to close the datasource when the application exits
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                if (dataSource != null) {
                    dataSource.close();
                }
            }));
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize the HikariCP DataSource", e);
        }
    }

    /**
     * Provides the singleton HikariDataSource instance for database connection pooling.
     *
     * @return HikariDataSource
     */
    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}

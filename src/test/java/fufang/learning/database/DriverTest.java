package fufang.learning.database;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class DriverTest {

    @Test
    void testRegister() {
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);

            // Verify the driver is registered
            boolean driverRegistered = false;
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver driver = drivers.nextElement();
                if (driver instanceof com.mysql.cj.jdbc.Driver) {
                    driverRegistered = true;
                    break;
                }
            }
            Assertions.assertTrue(driverRegistered, "MySQL driver should be registered");

        } catch (SQLException e) {
            Assertions.fail(e);
        }
    }

    @AfterEach
    void unregisterDriver() {
        try {
            DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            Assertions.fail("Failed to deregister MySQL driver", e);
        }
    }
}

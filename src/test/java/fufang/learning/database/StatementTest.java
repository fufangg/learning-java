package fufang.learning.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

    @Test
    void testCreateStatement() throws SQLException {
        // Use try-with-resources to ensure proper resource management
        try (Connection connection = DatabaseConnection.getDataSource().getConnection();
             Statement statement = connection.createStatement()) {

            Assertions.assertNotNull(statement, "Statement should be created successfully");
        }
    }

    @Test
    void testExecuteStatement() throws SQLException {
        String sql = """
               INSERT INTO program(id, scholarship, university, course, ielts, gpa, rec_letter) 
               VALUES (1, 'chevening', 'imperial college', 'computer science', '6.5', null, true)
               """;

        // Use try-with-resources to ensure proper resource management
        try (Connection connection = DatabaseConnection.getDataSource().getConnection();
             Statement statement = connection.createStatement()) {

            int update = statement.executeUpdate(sql);

            // Assert that one row was inserted
            Assertions.assertEquals(1, update, "One row should have been inserted");

            // Optional: Rollback the transaction to ensure test data does not persist
            connection.rollback();  // Only if your DB supports transactions
        }
    }
}

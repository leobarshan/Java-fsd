import java.sql.*;

public class question5 {
    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
    static final String USERNAME = "root";
    static final String PASSWORD = "barshan2";

    public static void main(String[] args) {
        // Create a connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the MySQL server.");

            // Create a new database
            createDatabase(connection, "mydatabase");

            // Select the created database 
            selectDatabase(connection, "mydatabase");

            // Drop the database
            dropDatabase(connection, "mydatabase");

        } catch (SQLException e) {
            // Exception handling
            e.printStackTrace();
        }
    }

    // Method to create a new database
    public static void createDatabase(Connection connection, String databaseName) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String sql = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(sql);
            System.out.println("Database '" + databaseName + "' created successfully.");
        }
    }

    // Method to select a database
    public static void selectDatabase(Connection connection, String databaseName) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String sql = "USE " + databaseName;
            statement.executeUpdate(sql);
            System.out.println("Selected database: " + databaseName);
        }
    }

    // Method to drop a database
    public static void dropDatabase(Connection connection, String databaseName) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String sql = "DROP DATABASE IF EXISTS " + databaseName;
            statement.executeUpdate(sql);
            System.out.println("Database '" + databaseName + "' dropped successfully.");
        }
    }
}

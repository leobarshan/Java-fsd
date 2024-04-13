
import java.sql.*;

public class question3 {
    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/phase02";
    static final String USERNAME = "root";
    static final String PASSWORD = "barshan2";

    public static void main(String[] args) {
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database.");

            // Step 2: Creating a Statement
            try (Statement statement = connection.createStatement()) {
                // Step 3: Executing a Query
                String query = "SELECT * FROM stdrecord WHERE age > 0";
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Step 4: Processing the ResultSet
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        int age = resultSet.getInt("age");
                        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


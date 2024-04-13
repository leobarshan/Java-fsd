import java.sql.*;

public class question6 {
    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/phase02";
    static final String USERNAME = "root";
    static final String PASSWORD = "barshan2";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database.");

            // Create the students table if not exists
            createStudentsTable(connection);

            // Insert a record
            int insertedId = insertRecord(connection, "John", 25);
            System.out.println("Inserted record with ID: " + insertedId);

            // Update a record
            updateRecord(connection, insertedId, "John Doe", 30);
            System.out.println("Updated record with ID: " + insertedId);

            // Display the updated record
            displayRecord(connection, insertedId);

            // Delete a record
            deleteRecord(connection, insertedId);
            System.out.println("Deleted record with ID: " + insertedId);

        } catch (SQLException e) {
            // Exception handling
            e.printStackTrace();
        }
    }

    // Method to create the students table
    public static void createStudentsTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS phase02.students (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(255) NOT NULL," +
                     "age INT" +
                     ")";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table 'students' created successfully.");
        }
    }

    // Method to insert a record
    public static int insertRecord(Connection connection, String name, int age) throws SQLException {
        int insertedId = -1;
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, name);
            statement.setInt(2, age);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet resultSet = statement.getGeneratedKeys()) {
                    if (resultSet.next()) {
                        insertedId = resultSet.getInt(1);
                    }
                }
            }
        }
        return insertedId;
    }

    // Method to update a record
    public static void updateRecord(Connection connection, int id, String name, int age) throws SQLException {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setInt(3, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("Record with ID " + id + " not found.");
            }
        }
    }

    // Method to display a record by ID
    public static void displayRecord(Connection connection, int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int studentId = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    System.out.println("ID: " + studentId + ", Name: " + name + ", Age: " + age);
                } else {
                    System.out.println("Record with ID " + id + " not found.");
                }
            }
        }
    }

    // Method to delete a record
    public static void deleteRecord(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Record with ID " + id + " not found.");
            }
        }
    }
}


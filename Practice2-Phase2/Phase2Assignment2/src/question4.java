import java.sql.*;

public class question4 {
    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/phase02";
    static final String USERNAME = "root";
    static final String PASSWORD = "barshan2";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database.");

            // Call the stored procedure
            String studentName = "John";
            try (CallableStatement statement = connection.prepareCall("{CALL get_student_age(?)}")) {
                statement.setString(1, studentName);
                boolean hasResults = statement.execute();

                // Process multiple result sets if available
                while (hasResults) {
                    try (ResultSet resultSet = statement.getResultSet()) {
                        while (resultSet.next()) {
                            int studentAge = resultSet.getInt("age");
                            System.out.println("Student's age: " + studentAge);
                        }
                    }
                    hasResults = statement.getMoreResults();
                }
            } catch (SQLException e) {
                // Exception handling
                System.err.println("Error calling stored procedure: " + e.getMessage());
            }
        } catch (SQLException e) {
            // Exception handling
            e.printStackTrace();
        }
    }
}

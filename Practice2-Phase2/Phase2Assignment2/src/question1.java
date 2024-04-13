import java.sql.*;

import java.sql.*;

public class question1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/phase02";
        String username = "root";
        String password = "barshan2";
        
        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            
            // Execute a query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM stdrecord");
            
            // Process the results
            while(resultSet.next()) {
                // Retrieve by column name
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                
                // Display values
                System.out.println("ID: " + id + ", Name: " + name);
            }
            
            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


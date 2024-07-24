package org.example;

import org.example.DatabaseConnection;

import java.sql.*;

public class User {
    private String id;
    private String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public boolean authenticate() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM users WHERE id = ? AND email = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
//            System.out.println(statement);
            statement.setInt(1, Integer.parseInt(id));
            statement.setString(2, email);
//            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();



            boolean authenticated = resultSet.next();

            resultSet.close();
            statement.close();

            return authenticated;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

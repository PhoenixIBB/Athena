package TarSetPackage;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class UserDao {

    private static final String URL = "jdbc:postgresql://192.168.0.7:1477/personaldata";
    private static final String USERNAME = "apple";
    private static final String PASSWORD = "14411441";

        public void insertUser(PersonalData user) {
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                System.out.println("Connection created");
                String sql = "INSERT INTO data (username, email, password, first_name, last_name, avatar_url) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, user.getUsername());
                    preparedStatement.setString(2, user.getEmail());
                    preparedStatement.setString(3, user.getPassword());
                    preparedStatement.setString(4, user.getFirstName());
                    preparedStatement.setString(5, user.getLastName());
                    preparedStatement.setString(6, user.getAvatarUrl());
                    preparedStatement.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("SQL Error: " + e.getMessage());
            }
        }

        public void printAllUsers() {
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                String sql = "SELECT * FROM data";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            System.out.println("User ID: " + resultSet.getLong("id"));
                            System.out.println("Username: " + resultSet.getString("username"));
                            System.out.println("Email: " + resultSet.getString("email"));
                            System.out.println("Password: " + resultSet.getString("password"));
                            System.out.println("First Name: " + resultSet.getString("first_name"));
                            System.out.println("Last Name: " + resultSet.getString("last_name"));
                            System.out.println("Avatar URL: " + resultSet.getString("avatar_url"));
                            System.out.println("------------------------");
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("SQL Error: " + e.getMessage());
            }
        }
    }

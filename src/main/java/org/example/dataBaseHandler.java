package org.example;

import java.sql.*;

public class dataBaseHandler {

    private static Connection connection;

    public static void connect() {
        try {
            // Utwórz połączenie do bazy danych SQLite.
            connection = DriverManager.getConnection("jdbc:sqlite:mystore.db");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            connect();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void createTables() {
        String sqlUsers = "CREATE TABLE IF NOT EXISTS users (\n"
                + "	id integer PRIMARY KEY AUTOINCREMENT,\n"
                + "	name text NOT NULL,\n"
                + "	surname text NOT NULL,\n"
                + "	username text NOT NULL,\n"
                + "	password text NOT NULL,\n"
                + "	type text NOT NULL\n"
                + ");";
        try {
            Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sqlUsers);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void addUser(String name, String surname, String username, String password, String type) {
        String sql = "INSERT INTO users(name, surname, username, password, type) VALUES(?,?,?,?,?)";

        try {
            Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, surname);
            pstmt.setString(3, username);
            pstmt.setString(4, password);
            pstmt.setString(5, type);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean validateUser(String username, String password, String type) {
        String sql = "SELECT COUNT(*) as count FROM users WHERE username = ? AND password = ? AND type = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, type);
            ResultSet rs = pstmt.executeQuery();

            int count = rs.getInt("count");
            return count > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}

package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDB {

    private static final String DB_URL = "jdbc:mysql://34.27.137.171:3306/final_project"; // Replace with your database
                                                                                          // URL
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {

        Connection con = MysqlDB.getConnection();
        if (con == null) {
            System.out.println("Failed to connect");
        } else {
            System.out.println("Successful connection");
        }

    }

}

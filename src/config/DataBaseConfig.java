package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {

    static String url = "jdbc:mysql://localhost:3306/bookmymovies";
    static String username = "root";
    static String password = "AnujBobade@21";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
//whenever I need a connection of my database, I will call this method with the class name.
//So that, no need to write this multiples times in multiple methods.
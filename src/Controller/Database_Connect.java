package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_Connect {
    public static Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:sqlserver://localhost:1433;databasename=QuanLySinhVien";
        String user = "sa";
        String password = "Dockersql123";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) { e.printStackTrace(); }
        return connection;
    }
}

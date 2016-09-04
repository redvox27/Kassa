package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by RonOS on 9/4/2016.
 */
public class DatabaseController {

    private Connection KassaConnection;
    private String databaseUrl = "jdbc:mysql://localhost:3306/kassa?autoReconnect=true&useSSL=false";
    private String databaseUsername = "root";
    private String databasePassword = "";

    public DatabaseController() {
        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        System.out.println("Connecting database...");
        try {
            KassaConnection = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }
}

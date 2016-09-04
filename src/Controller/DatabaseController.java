package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by RonOS on 9/4/2016.
 */
public class DatabaseController {

    private Connection KassaConnection;
    private String connectionString = "jdbc:mysql://localhost:3306/DBNAME\", \"usrname\", \"pswd\"";

    public DatabaseController() {
        try {
            KassaConnection = DriverManager.getConnection(connectionString);
        }
        catch (SQLException ex) {

        }
    }
}

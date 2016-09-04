package Controller;

import Logic.Product;

import java.sql.*;

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

    public Product getProductByCode(int productCode) {
        try {
            Statement stmt = KassaConnection.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM product WHERE id=\'" + productCode + "\'");
            int price = 0;
            int id = 0;
            String name = "";
            String description = "";
            String allergy = "";
            while (result.next())
            {
                id = result.getInt("id");
                name = result.getString("name");
                price = result.getInt("price");
                description = result.getString("description");
                allergy = result.getString("allergy");


            }

            return new Product(id, name, price, allergy, description);
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot execute query", ex);
        }

    }

    public void addProduct(String productname, int price, String description, String allergy) {
        try {
            Statement stmt = KassaConnection.createStatement();
            stmt.executeUpdate("INSERT INTO product VALUES (NULL ,\'" + price + "\', \'" + productname + "\', \'" + allergy + "\', \'" + description + "\')");
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot execute query", ex);
        }
    }
}

package Main;

import Controller.DatabaseController;
import Logic.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by vincent on 4-9-2016.
 */
public class Main {


    public static void main(final String[] args) {

        DatabaseController database = new DatabaseController();
        //Product testProduct = database.getProductByCode(1);
        database.addProduct("Gehaktbal", 1000, "Een gehaktbal", "Geen");
        //System.out.println(testProduct.toString());
    }
}

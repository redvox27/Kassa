package Model;

import Logic.Employees;
import Logic.Product;

import java.util.ArrayList;

/**
 * Created by vincent on 4-9-2016.
 */
public class KassaModel {
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Employees> employeeList = new ArrayList<Employees>();
    //TODO  sql connectie
    //TODO Producten toevoegen
    //TODO Kiloprijs
    //TODO lijst

    public KassaModel(){

    }

    public void printReceipt(){
        // naam en dan prijs van product

        int totalPrice = 0;

        for(Product product : productList){
            System.out.println(product.getName() + product.getPrice());

            totalPrice = product.getPrice() + totalPrice;



        }
        System.out.println(totalPrice);


    }

    public void addEmployees(Employees newEmployee){
        if(newEmployee == null){
            System.out.println("Vul een naam in");
        }
        else {
            employeeList.add(newEmployee);
        }
    }

    public void addProducts(Product newProduct){
        if(newProduct == null){
            System.out.println("Vul een product in gore KUT");
        }
        else {
            productList.add(newProduct);
        }
    }

}

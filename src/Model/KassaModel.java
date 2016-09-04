package Model;

import Logic.Employee;
import Logic.Product;

import java.util.ArrayList;

/**
 * Created by vincent on 4-9-2016.
 */
public class KassaModel {
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    //TODO  sql connectie
    //TODO Producten toevoegen
    //TODO Kiloprijs
    //TODO lijst

    public KassaModel(){

    }

    public void printReceipt(){
        // naam en dan prijs van product

        double totalPrice = 0;

        for(Product product : productList){
            System.out.println(product.getName() + product.getPrice());

            totalPrice = product.getPrice() + totalPrice;



        }
        System.out.println(totalPrice);


    }

    public void addEmployees(Employee newEmployee){
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

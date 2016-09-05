package Model;

import Logic.Employee;
import Logic.Product;

import java.util.ArrayList;

/**
 * Created by vincent on 4-9-2016.
 */
public class KassaModel {
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Employee> employeeList;
    private Employee currentEmployee;

    public KassaModel(ArrayList<Employee> employeeList){
        this.employeeList = employeeList;
    }

    public void selectEmployee(Employee employee) {
        //TODO verify if employee is part of the list.
        currentEmployee = employee;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getEmployeeCount() {
        return employeeList.size();
    }

    public Employee getCurrentEmployee() {
        return currentEmployee;
    }

    public Employee getEmployee(int index) {
        return employeeList.get(index);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void printReceipt(){
        // naam en dan prijs van product

        int totalPrice = 0;

        for(Product product : productList){
            System.out.println(product.getName() + " " + product.getPrice());
            totalPrice = product.getPrice() + totalPrice;
        }
        System.out.println("------------------");
        System.out.println(totalPrice);


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

package Controller;

import Logic.Product;

import java.util.ArrayList;

/**
 * Created by vincent on 4-9-2016.
 */
public class KassaController {
    private ArrayList<Product> productList = new ArrayList<Product>();

    public KassaController() {

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


}

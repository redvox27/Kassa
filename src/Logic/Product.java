package Logic;



import java.sql.*;


/**
 * Created by vincent on 4-9-2016.
 */
public class Product {
    private  String name;
    private int code;
    private int price;
    private String allergics;
    private String description;


    public Product(int code, String name, int price, String allergics, String description) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.allergics = allergics;
        this.description = description;
    }

    public String toString() {
        return name + ";" + code + ";" + price + ";" + allergics + ";" + description;
    }

    public  String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }

    public int getPrice(){
        return price;
    }

    public String getAllergics(){
        return allergics;
    }

    public String getDescription() {
        return description;
    }
}

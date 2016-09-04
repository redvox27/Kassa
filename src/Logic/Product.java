package Logic;

/**
 * Created by vincent on 4-9-2016.
 */
public class Product {
    private String name;
    private int code;
    private int price;
    private String allergics;
    private String description;

    public Product(int code){
        this.code = code;

        //TODO shit ophalen van de database jawohl.
    }

    public String getName(){
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

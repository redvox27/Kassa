package Logic;

/**
 * Created by RonOS on 9/4/2016.
 */
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name + ";" + id;
    }


}

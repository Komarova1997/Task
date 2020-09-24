package task3;

public class Product {
    private final long id;
    private final String name;
    private final int quantity;
    private final int callories;

    Product(long id, String name, int quantity, int callories){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.callories = callories;
    }
    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getCalories(){
        return callories;
    }

    public void productInformation(){
        System.out.println("Number: " + id + "   Name: " + name + "   Quantity: " + quantity + "  Calories: " + callories);
    }
}

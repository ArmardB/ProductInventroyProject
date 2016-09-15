package bellamy.armard.ProductInventoryProject;

import java.util.Random;

/**
 * Created by armardbellamy on 9/15/16.
 */

public class Product {

    private double price;
    private int id;
    private int quantity;
    private Random rand = new Random();

    public Product(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
        this.id = rand.nextInt(9000 + 1) + 1000;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = rand.nextInt(9999 + 1) + 1000;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void generateRandom(){
        Math.random();
    }

    public String toString(){
       return "Product ID: " + getId() + " | " + " Quantity: " + getQuantity() + " | " + "Price: " + getPrice();

    }


}

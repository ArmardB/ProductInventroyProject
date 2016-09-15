package bellamy.armard.ProductInventoryProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by armardbellamy on 9/15/16.
 */
public class Inventory {

    private double total;

    private ArrayList<Product> inventoryManager = new ArrayList<Product>();

    public void printInventory(){
        for (Product product: inventoryManager){
            System.out.println(product);
        }
    }

    public void addProduct(Product product){
        inventoryManager.add(product);
    }

    public double getInventoryTotal(){
        for (Product product: inventoryManager){
            total += (product.getPrice() * product.getQuantity());
        }
        return total;
    }

    public void printInventoryTotal(){
        System.out.println("The total value of the inventory is: $" + getInventoryTotal());
    }
}

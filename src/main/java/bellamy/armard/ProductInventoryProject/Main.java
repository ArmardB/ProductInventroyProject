package bellamy.armard.ProductInventoryProject;

/**
 * Created by armardbellamy on 9/15/16.
 */
public class Main {

    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Product broccoli = new Product(5.00, 12);
        Product cheddar = new Product(10.00, 2);

        inventory.addProduct(broccoli);
        inventory.addProduct(cheddar);

        inventory.printInventory();
        inventory.printInventoryTotal();

    }


}

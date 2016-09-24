package bellamy.armard.ProductInventoryProject;

/**
 * Created by armardbellamy on 9/15/16.
 */
public class Main {

    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Product broccoli = new Product(5.00, 12);
        Product bacon = new Product(10.00, 2);

        inventory.addProduct(broccoli);
        inventory.addProduct(bacon);

        inventory.printInventory();
        inventory.printInventoryTotal();

    }


}

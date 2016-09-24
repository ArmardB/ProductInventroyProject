package bellamy.armard.ProductInventoryProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class InventoryTest {

    Inventory inventory;
    Product product;

    @Before
    public void initialize(){
        inventory = new Inventory();
    }

    @Test
    public void printInventoryTest(){
        Product apple = new Product(5.00, 2);
        inventory.addProduct(apple);
        String expected = "Product ID: 25 |  Quantity: 2 | Price: 5.0";
        String actual = inventory.printInventory();
        Assert.assertEquals("Product ID: 25 |  Quantity: 2 | Price: 5.0", expected, actual);
    }






}

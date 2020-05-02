package Task19_VendingMachineTests;

import Task19_VendingMachine_V1.WishProduct;
import org.junit.Test;

public class WishProductTest {


    @Test(expected = IllegalArgumentException.class)
    public void invalidProductShouldThrowException(){
        WishProduct wishProduct = new WishProduct("Beer");

    }


}

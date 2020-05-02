package Task19_VendingMachineTests;

import Task19_VendingMachine_V1.User;
import Task19_VendingMachine_V1.UsersCoins;
import Task19_VendingMachine_V1.WishProduct;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void cancelledOrderShouldReturnStringWithMyChange() {
        WishProduct wishProduct = new WishProduct("Coke");
        UsersCoins usersCoins = new UsersCoins("penny - 5, nickel - 0, dime - 5, quarter - 0");
        User user = new User(wishProduct, usersCoins);
        Assert.assertEquals("Your order has been cancelled!" + System.lineSeparator()+
                "Your refund is:" + System.lineSeparator()+
                "penny - 5" + System.lineSeparator()+
                "nickel - 0" + System.lineSeparator()+
                "dime - 5" + System.lineSeparator()+
                "quarter - 0" + System.lineSeparator()+
                "The Sum is: 0.55£", user.cancelledOrder());
    }


}

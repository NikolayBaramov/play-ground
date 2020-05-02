package Task19_VendingMachineTests;

import Task19_VendingMachine_V1.UsersCoins;
import org.junit.Assert;
import org.junit.Test;

public class UserCoinsTest {

    @Test
    public void calculateMoneyShouldCalculateTheSum(){
        UsersCoins usersCoins = new UsersCoins("penny - 6, nickel - 1, dime - 5, quarter - 2");
        usersCoins.calculateMoney();
        Assert.assertEquals(111.0,usersCoins.getAllMoney(),0.1);

    }

}

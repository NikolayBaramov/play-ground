package Task19_VendingMachineTests;

import Task19_VendingMachine_V1.*;
import org.junit.Assert;
import org.junit.Test;

public class DealTest {


    @Test(expected = IllegalArgumentException.class)
    public void notEnoughMoneyShouldThrowException() {
        WishProduct wishProduct = new WishProduct("Soda");
        UsersCoins usersCoins = new UsersCoins("penny - 4, nickel - 0, dime - 4, quarter - 0");
        User user = new User(wishProduct, usersCoins);
        VendingMachine vendingMachine = new VendingMachine();
        Deal deal = new Deal(user, vendingMachine);
        deal.buyDrink();
    }

    @Test
    public void decreaseMachineDrinksShouldSubtractOneDrink() {
        UsersCoins usersCoins = new UsersCoins("penny - 4, nickel - 0, dime - 4, quarter - 0");
        WishProduct wishProduct = new WishProduct("Soda");
        User user = new User(wishProduct, usersCoins);
        VendingMachine vendingMachine = new VendingMachine();
        Deal deal = new Deal(user, vendingMachine);
        deal.decreaseMachineDrinks();
        deal.decreaseMachineDrinks();
        Assert.assertEquals(Integer.valueOf(3), vendingMachine.getDrinkAvailability().get(Product.Soda));

    }

    @Test
    public void increaseMachineCoinsShouldDoIt() {
        UsersCoins usersCoins = new UsersCoins("penny - 4, nickel - 0, dime - 4, quarter - 0");
        WishProduct wishProduct = new WishProduct("Coke");
        User user = new User(wishProduct, usersCoins);
        VendingMachine vendingMachine = new VendingMachine();
        Deal deal = new Deal(user, vendingMachine);
        deal.increaseMachineCoins();
        Assert.assertEquals("This coins are available:" + System.lineSeparator()+
                "penny - 14" + System.lineSeparator()+
                "nickel - 10" + System.lineSeparator()+
                "dime - 14" + System.lineSeparator()+
                "quarter - 10" + System.lineSeparator()+
                "The net cash is: 4.54£",vendingMachine.moneyLeft());

    }


    @Test
    public void decreaseMachineCoinsShouldDoIt() {
        UsersCoins usersCoins = new UsersCoins("penny - 4, nickel - 0, dime - 4, quarter - 0");
        WishProduct wishProduct = new WishProduct("Pepsi");
        User user = new User(wishProduct, usersCoins);
        VendingMachine vendingMachine = new VendingMachine();
        Deal deal = new Deal(user, vendingMachine);
        deal.buyDrink();
        deal.decreaseMachineCoins();
        Assert.assertEquals("This coins are available:" + System.lineSeparator()+
                "penny - 6" + System.lineSeparator()+
                "nickel - 9" + System.lineSeparator()+
                "dime - 10" + System.lineSeparator()+
                "quarter - 10" + System.lineSeparator()+
                "The net cash is: 4.01£",vendingMachine.moneyLeft());

    }


}

package Task19_VendingMachine_V1;

public class Main {
    public static void main(String[] args) {

//        // canceled Order and wrong product chosen
//        String inputCoins = "penny - 5, nickel - 2, dime - 3, quarter - 2, test - 100, cancel";
//        UsersCoins userCoins = new UsersCoins(inputCoins);
//
//        String inputDrink = "Soda5";
//
//        WishProduct wish = null;
//        try {
//            wish = new WishProduct(inputDrink);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        User customer = new User(wish,userCoins);
//        if (customer.getCoins().getHasCancelled()){
//            System.out.println(customer.cancelledOrder());
//        }

        // true order and change expected
        String inputCoins2 = "penny - 0, nickel - 0, dime - 5, quarter - 0, test - 50";
        UsersCoins userCoins2 = new UsersCoins(inputCoins2);

        String inputDrink2 = "Coke";

        WishProduct wish2 = null;
        try {
            wish2 = new WishProduct(inputDrink2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        User customer2 = new User(wish2, userCoins2);
        if (customer2.getCoins().getHasCancelled()) {
            System.out.println(customer2.cancelledOrder());
            return;
        }

        VendingMachine machine = new VendingMachine();
        Deal myDeal = new Deal(customer2, machine);
        try {
            myDeal.buyDrink();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (myDeal.getChange() == 0) {
            System.out.println("Your change is 0.0£, have a nice day!");
            myDeal.decreaseMachineDrinks();
        } else if (myDeal.getChange() > 0) {
            myDeal.decreaseMachineDrinks();
            myDeal.increaseMachineCoins();
            try {
                myDeal.decreaseMachineCoins();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(myDeal.getChangeInfo());
        }

        System.out.println(machine.drinksLeft());
        System.out.println(machine.moneyLeft());


    }
}

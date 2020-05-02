package Task19_VendingMachine_V1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Deal {
    private User someUser;
    private VendingMachine vend;
    private double change;
    private LinkedHashMap<Coins, Integer> changeAsCoins;

    public Deal(User someUser, VendingMachine vend) {
        this.someUser = someUser;
        this.vend = vend;
    }

    public void buyDrink() {
        this.someUser.getCoins().calculateMoney();
        double customersMoney = this.someUser.getCoins().getAllMoney();
        double priceDrink = this.someUser.getWishProd().getProduct().getPrice();
        if (customersMoney < priceDrink) {
            this.setChange(-1.0);
            throw new IllegalArgumentException("Please insert more coins!");
        } else if (customersMoney == priceDrink) {
            this.setChange(0.0);
        } else {
            this.setChange(customersMoney - priceDrink);
        }
    }

    public double getChange() {
        return this.change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public void decreaseMachineDrinks() {
        this.vend.getDrinkAvailability().put(this.someUser.getWishProd().getProduct()
                , this.vend.getDrinkAvailability().get(this.someUser.getWishProd().getProduct()) - 1);
    }

    public LinkedHashMap<Coins, Integer> getChangeAsCoins() {
        return this.changeAsCoins;
    }

    public void increaseMachineCoins() {
        LinkedHashMap<Coins, Integer> mapFromCustomer = this.someUser.getCoins().getUserMoney();
        LinkedHashMap<Coins, Integer> mapFromMachine = this.vend.getCashAvailability();
        for (Map.Entry<Coins, Integer> entry : mapFromCustomer.entrySet()) {
            mapFromMachine.put(entry.getKey(), mapFromMachine.get(entry.getKey()) + mapFromCustomer.get(entry.getKey()));
        }
        this.someUser.getCoins().setUserMoneyFromMap(mapFromMachine);

    }

    public void decreaseMachineCoins() {
        double currentChange = this.getChange();
        this.changeAsCoins = new LinkedHashMap<>();
        while (currentChange > 0) {
            if (this.vend.getCashAvailability().get(Coins.quarter) > 0
                    && currentChange % 25 == 0) {
                this.vend.getCashAvailability()
                        .put(Coins.quarter, this.vend.getCashAvailability().get(Coins.quarter) - 1);
                // махам един quarter от вендинг машината

                if (!this.changeAsCoins.containsKey(Coins.quarter)) {
                    this.changeAsCoins.put(Coins.quarter, 1);
                } else {
                    this.changeAsCoins.put(Coins.quarter, this.changeAsCoins.get(Coins.quarter) + 1);
                }
                currentChange = currentChange - 25;


            } else if (this.vend.getCashAvailability().get(Coins.dime) > 0
                    && currentChange % 10 == 0) {

                this.vend.getCashAvailability()
                        .put(Coins.dime, this.vend.getCashAvailability().get(Coins.dime) - 1);
                // махам един dime от вендинг машината

                if (!this.changeAsCoins.containsKey(Coins.dime)) {
                    this.changeAsCoins.put(Coins.dime, 1);
                } else {
                    this.changeAsCoins.put(Coins.dime, this.changeAsCoins.get(Coins.dime) + 1);
                }
                currentChange = currentChange - 10;


            } else if (this.vend.getCashAvailability().get(Coins.nickel) > 0
                    && currentChange % 5 == 0) {

                this.vend.getCashAvailability()
                        .put(Coins.nickel, this.vend.getCashAvailability().get(Coins.nickel) - 1);
                // махам един nickel от вендинг машината

                if (!this.changeAsCoins.containsKey(Coins.nickel)) {
                    this.changeAsCoins.put(Coins.nickel, 1);
                } else {
                    this.changeAsCoins.put(Coins.nickel, this.changeAsCoins.get(Coins.nickel) + 1);
                }
                currentChange = currentChange - 5;

            } else if (this.vend.getCashAvailability().get(Coins.penny) > 0) {
                this.vend.getCashAvailability().put(Coins.penny, this.vend.getCashAvailability().get(Coins.penny) - 1);
                // махам едно penny от вендинг машината
                if (!this.changeAsCoins.containsKey(Coins.penny)) {
                    this.changeAsCoins.put(Coins.penny, 1);
                } else {
                    this.changeAsCoins.put(Coins.penny, this.changeAsCoins.get(Coins.penny) + 1);
                }
                currentChange = currentChange - 1;
            } else if (!this.vend.isVendCashLeft()) {
                throw new IllegalArgumentException("Your change, will be given for charity, thank you for your support!");
            }
        }
    }

    public String getChangeInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Your change is %.2f£!%n", this.getChange() / 100.0));
        LinkedHashMap<Coins, Integer> change = this.getChangeAsCoins();
        for (Map.Entry<Coins, Integer> entry : change.entrySet()) {
            stringBuilder.append(String.format("%s - %d%n", entry.getKey(), entry.getValue()));
        }
        stringBuilder.append(System.lineSeparator());
        return stringBuilder.toString();
    }

}

package Task19_VendingMachine_V1;

import java.util.LinkedHashMap;
import java.util.Map;


public class VendingMachine {
    private static final int COUNT_DRINKS = 5;
    private static final int COUNT_COINS = 10;
    private LinkedHashMap<Coins, Integer> cashAvailability;
    private LinkedHashMap<Product, Integer> drinkAvailability;
    private boolean vendCashLeft;

    public VendingMachine() {
        this.setAvailability();
        this.vendCashLeft = true;
    }

    public LinkedHashMap<Coins, Integer> getCashAvailability() {
        return this.cashAvailability;
    }

    public LinkedHashMap<Product, Integer> getDrinkAvailability() {
        return this.drinkAvailability;
    }

    public void setAvailability() {
        this.cashAvailability = new LinkedHashMap<>();
        for (Coins coin : Coins.values()) {
            this.cashAvailability.put(coin, COUNT_COINS);
        }
        this.drinkAvailability = new LinkedHashMap<>();
        for (Product p : Product.values()) {
            this.drinkAvailability.put(p, COUNT_DRINKS);
        }
    }

    public String drinksLeft() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Product, Integer> e : this.getDrinkAvailability().entrySet()) {
            sb.append(String.format("%s - %d", e.getKey(), e.getValue()));
            sb.append(System.lineSeparator());
        }
        return String.format("This drinks are available:%n") + sb.toString();
    }

    public String moneyLeft() {
        StringBuilder sb = new StringBuilder();
        double sumMoney = 0.0;
        for (Map.Entry<Coins, Integer> entry : this.getCashAvailability().entrySet()) {
            sb.append(String.format("%s - %d", entry.getKey(), entry.getValue()));
            sb.append(System.lineSeparator());
            sumMoney = sumMoney + ((entry.getKey().getCoinValue())) * entry.getValue();
        }
        if (sumMoney == 0) {
            this.vendCashLeft = false;
        }
        return String.format("This coins are available:%n%sThe net cash is: %.2f£", sb, sumMoney/100.0);
    }

    public boolean isVendCashLeft() {
        return this.vendCashLeft;
    }
}

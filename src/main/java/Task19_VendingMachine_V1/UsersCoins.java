package Task19_VendingMachine_V1;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsersCoins {
    private LinkedHashMap<Coins, Integer> UserMoney;
    private boolean hasCancelled;
    private double allMoney;

    public UsersCoins(String input) {
        this.setUserMoneyFromMap(input);
    }

    public LinkedHashMap<Coins, Integer> getUserMoney() {
        return this.UserMoney;
    }

    public void setUserMoneyFromMap(LinkedHashMap<Coins, Integer> userMoney) {
        this.UserMoney = userMoney;
    }

    public boolean getHasCancelled() {
        return this.hasCancelled;
    }

    public void setUserMoneyFromMap(String input) {
        LinkedHashMap<Coins, Integer> money = new LinkedHashMap<>();
        String[] pairs = input.split(", ");
        this.hasCancelled = false;
        for (String pair : pairs) {
            if (pair.equals("cancel")) {
                this.hasCancelled = true;
                break;
            }
            String[] keyValue = pair.split(" - ");
            String key = keyValue[0];
            int value = Integer.parseInt(keyValue[1]);
            if (containsEnumCoin(key)) {
                Coins coin = Coins.valueOf(key);
                if (!money.containsKey(coin)) {
                    money.put(coin, value);
                } else {
                    money.put(coin, money.get(coin) + value);
                }
            }
        }
        this.UserMoney = money;

    }


    public boolean containsEnumCoin(String coinName) {
        for (Coins c : Coins.values()) {
            if (c.name().equals(coinName)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        double result = 0.0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Coins, Integer> entry : this.getUserMoney().entrySet()) {
            stringBuilder.append(String.format("%s - %d", entry.getKey(), entry.getValue()));
            stringBuilder.append(System.lineSeparator());
            result = result + (entry.getKey().getCoinValue() / 100.0) * entry.getValue();
        }
        return String.format("%sThe Sum is: %.2f£", stringBuilder, result);
    }

    public void calculateMoney() {
        double result = 0.0;
        for (Map.Entry<Coins, Integer> entry : this.getUserMoney().entrySet()) {
            result = result + (entry.getKey().getCoinValue()) * entry.getValue();

        }
        this.allMoney = result;
    }

    public double getAllMoney() {
        return this.allMoney;
    }
}

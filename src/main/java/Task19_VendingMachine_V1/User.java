package Task19_VendingMachine_V1;

public class User {
    private WishProduct wishProd;
    private UsersCoins uCoins;

    public User(WishProduct wishProd, UsersCoins uCoins) {
        this.wishProd = wishProd;
        this.uCoins = uCoins;
    }

    public WishProduct getWishProd() {
        return this.wishProd;
    }

    public UsersCoins getCoins() {
        return this.uCoins;
    }

    public String cancelledOrder() {
      return String.format("Your order has been cancelled!%nYour refund is:%n" + this.getCoins().toString());

    }

}

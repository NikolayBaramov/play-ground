package Task19_VendingMachine_V1;

public class WishProduct {

    private Product product;

    public WishProduct(String productName) {
      this.setSelectedProduct(productName);
    }

    public Product getProduct() {
        return this.product;
    }

    public void setSelectedProduct(String productName) {
        if (!containsEnum(productName)) {
            throw new IllegalArgumentException("There is no such a product!");
        }
        this.product = Product.valueOf(productName);
    }

    public boolean containsEnum(String productName) {
        for (Product p : Product.values()) {
            if (p.name().equals(productName)) {
                return true;
            }
        }
        return false;
    }

}

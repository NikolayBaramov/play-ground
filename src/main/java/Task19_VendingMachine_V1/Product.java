package Task19_VendingMachine_V1;

public enum Product {
    Coke(25),
    Pepsi(35),
    Soda(45);

    private final int price;

    Product(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

}

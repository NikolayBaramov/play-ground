package Task19_HotelReservation_SU;

public enum DiscountType {
    None(0),
    SecondVisit(10),
    VIP(20);

    private int discountTypeMultiplier;

    DiscountType(int discountTypeMultiplier) {
        this.discountTypeMultiplier = discountTypeMultiplier;
    }

    public double getDiscountTypeMultiplier() {
        return 1 - this.discountTypeMultiplier / 100.0;
    }

}

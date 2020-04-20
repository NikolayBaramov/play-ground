package Task19_HotelReservation_SU;

public class PriceCalculator {
    private double pricePerDay;
    private int numbOfDays;
    private String actualSeason;
    private String actualDiscountType;

    public PriceCalculator(double pricePerDay, int numbOfDays
            , String actualSeason, String actualDiscountType) {
        this.pricePerDay = pricePerDay;
        this.numbOfDays = numbOfDays;
        this.actualSeason = actualSeason;
        this.actualDiscountType = actualDiscountType;
    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }

    public int getNumbOfDays() {
        return this.numbOfDays;
    }

    public String getActualSeason() {
        return this.actualSeason;
    }

    public String getActualDiscountType() {
        return this.actualDiscountType;
    }

    public double calculateThePrice() {
        return getPricePerDay() * getNumbOfDays()
                * Season.valueOf(getActualSeason()).getSeasonMultiplier()
                * DiscountType.valueOf(getActualDiscountType()).getDiscountTypeMultiplier();
    }

}

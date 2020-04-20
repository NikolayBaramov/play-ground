package Task19_HotelReservation_SU;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int seasonMultiplier;
    // това са полетата на Enum

    Season(int seasonMultiplier){
        this.seasonMultiplier = seasonMultiplier;
        // конструктора ми за Season
    }

    public int getSeasonMultiplier() {
        return this.seasonMultiplier;
    }
}

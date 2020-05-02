package Task19_Restaurant_SU;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    private static final double SALMON_GRAMS = 22;

    public Salmon(BigDecimal price) {
        super(Salmon.class.getSimpleName(), price, SALMON_GRAMS);
    }


}

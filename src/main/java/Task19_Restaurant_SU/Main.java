package Task19_Restaurant_SU;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Salmon mySalmon = new Salmon(BigDecimal.valueOf(50));

        System.out.println(mySalmon.getName());
        System.out.println(mySalmon.getGrams());
        System.out.println(mySalmon.getPrice());


    }
}

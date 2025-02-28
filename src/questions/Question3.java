package questions;

import java.time.LocalDateTime;

public class Question3 {
    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusDays(0);

        System.out.println("localDateTime1: " + localDateTime1);
        System.out.println("localDateTime2: " + localDateTime2);

        if (localDateTime2.isAfter(localDateTime1) || localDateTime2.isBefore(localDateTime1)) {
            System.out.println("localDateTime1 and localDateTime2 are not same");
        } else {
            System.out.println("localDateTime1 and localDateTime2 are same");
        }
    }
}

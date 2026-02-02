///5 darab kockadobás, egymás mellett kiírva
///ha van 2 darab ugyan olyan akkor annal kiirju, hogy pár
/// ha van 3 darab ugyan olyan akkor annal kiirju, hogy terc

import java.util.Random;

public class Poker {
    public static void humanThrow() {
        Random random = new Random();


        int kocka1 = random.nextInt(6) + 1;

        int kocka2 = random.nextInt(6) + 1;

        int kocka3 = random.nextInt(6) + 1;

        int kocka4 = random.nextInt(6) + 1;

        int kocka5 = random.nextInt(6) + 1;
        System.out.printf(
            "%6s %d %d %d %d %d\n",
            "Ember"
        );
    }
}

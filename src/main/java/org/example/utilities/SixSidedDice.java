package org.example.utilities;
import java.util.Random;

public class SixSidedDice {
    public static int roll(Random random) {
        return random.nextInt(6) + 1;
    }
}

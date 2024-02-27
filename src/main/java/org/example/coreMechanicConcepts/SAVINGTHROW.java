package org.example.coreMechanicConcepts;
import org.example.coreProfileModellStats.SAVE;
import java.util.Random;

public class SAVINGTHROW {
    private static final Random random = new Random();

    // Method to roll a six-sided dice for the saving throw
    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    // Method to determine if the saving throw is successful
    public static boolean saveRoll(SAVE save) {
        int rollResult = rollDice();

        // Check if the roll result is equal to or higher than the save characteristic value
        return rollResult >= save.getSave();
    }
}

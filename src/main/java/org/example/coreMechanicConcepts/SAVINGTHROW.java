package org.example.coreMechanicConcepts;

import org.example.coreProfileModellStats.SAVE;
import org.example.utilities.SixSidedDice;

import static org.example.coreMechanicConcepts.BATTLEMECHANIC.random;

public class SAVINGTHROW {
    // Method to determine if the saving throw is successful
    public static boolean saveRoll(SAVE save) {
        int rollResult = SixSidedDice.roll(random);

        // Check if the roll result is equal to or higher than the save characteristic value
        return rollResult >= save.getSave();
    }
}

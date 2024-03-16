package org.example.coreMechanicConcepts;

import org.example.coreProfileWeaponStats.STRENGTH;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.utilities.SixSidedDice;

import static org.example.coreMechanicConcepts.BATTLEMECHANIC.random;

public class WOUNDROLL {
    // Method to determine if a wound is successfully inflicted
    public static boolean woundRoll(STRENGTH strength, TOUGHNESS toughness) {
        int rollResult = SixSidedDice.roll(random);
        int requiredRoll = getRequiredRoll(strength.getStrength(), toughness.getToughness());

        // An unmodified Wound roll of 6 is always successful
        if (rollResult == 6) {
            return true;
        }
        // An unmodified Wound roll of 1 always fails
        else if (rollResult == 1) {
            return false;
        }
        // Check if the roll result is equal to or greater than the required roll
        else {
            return rollResult >= requiredRoll;
        }
    }

    // Method to determine the required roll based on the strength and toughness values
    private static int getRequiredRoll(int strength, int toughness) {
        // Determine the difference between strength and toughness
        int difference = strength - toughness;

        // Map the difference to the corresponding required roll
        if (difference >= 2) {
            return 2; // Wound roll of 2 required if Strength is twice (or more than twice) the Toughness
        } else if (difference == 1) {
            return 3; // Wound roll of 3 required if Strength is greater than Toughness
        } else if (difference == 0) {
            return 4; // Wound roll of 4 required if Strength is equal to Toughness
        } else if (difference == -1) {
            return 5; // Wound roll of 5 required if Strength is less than Toughness
        } else {
            return 6; // Wound roll of 6 required if Strength is half (or less than half) the Toughness
        }
    }
}

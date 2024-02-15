package org.example.coreMechanicConcepts;

import org.example.entity.AstartesMeleeWeaponEntity;
import org.example.entity.AstartesRangedWeaponEntity;

import java.util.Random;

public class HITROLL {
    private static final Random random = new Random();

    // Method to roll a six-sided dice
    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    // Method to determine if a hit is scored for a ranged attack
    public static boolean rangedAttackHit(AstartesRangedWeaponEntity rangedWeapon) {
        int rollResult = rollDice();
        // An unmodified Hit roll of 1 always fails
        if (rollResult == 1) {
            return false;
        }
        // A hit is scored if the D6 result equals or exceeds the ballistic skill
        if (rollResult >= rangedWeapon.getBallisticSkill()) {
            return true;
        }
        // Critical Hit: An unmodified Hit roll of 6 always hits
        return rollResult == 6;
    }

    // Method to determine if a hit is scored for a melee attack
    public static boolean meleeAttackHit(AstartesMeleeWeaponEntity meleeWeapon) {
        int rollResult = rollDice();
        // An unmodified Hit roll of 1 always fails
        if (rollResult == 1) {
            return false;
        }
        // A hit is scored if the D6 result equals or exceeds the weapon skill
        if (rollResult >= meleeWeapon.getWeaponSkill()) {
            return true;
        }
        // Critical Hit: An unmodified Hit roll of 6 always hits
        return rollResult == 6;
    }
}

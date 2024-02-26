package org.example.coreMechanicConcepts;

import org.example.coreProfileWeaponStats.ATTACKS;
import org.example.coreProfileWeaponStats.D3ORD6ATTACKS;
import org.example.entity.AstartesMeleeWeaponEntity;
import org.example.entity.AstartesRangedWeaponEntity;

import java.util.Random;

public class HITROLL {
    private static final Random random = new Random();

    // Method to roll a six-sided dice
    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    // Method to determine if a hit is scored for a melee attack
    public static int meleeAttackHit(AstartesMeleeWeaponEntity meleeWeapon) {
        int successfulHits = 0;
        int totalAttacks = getAttacks(meleeWeapon.getAttacks()); // Total number of attacks

        for (int i = 0; i < totalAttacks; i++) {
            int rollResult = rollDice();
            int weaponSkill = meleeWeapon.getWeaponSkill().getWeaponSkill(); // Weapon skill

            // A hit is scored if the D6 result is greater than 1 and equals or exceeds the weapon skill
            if (rollResult > 1 && rollResult >= weaponSkill) {
                successfulHits++;
            }
            // Critical Hit: An unmodified Hit roll of 6 always hits
            else if (rollResult == 6) {
                successfulHits++;
            }
        }
        return successfulHits;
    }

    // Method to determine if a hit is scored for a ranged attack
    public static int rangedAttackHit(AstartesRangedWeaponEntity rangedWeapon) {
        int successfulHits = 0;
        int totalAttacks = getAttacks(rangedWeapon.getAttacks()); // Total number of attacks

        for (int i = 0; i < totalAttacks; i++) {
            int rollResult = rollDice();
            int ballisticSkill = rangedWeapon.getBallisticSkill().getBallisticSkill(); // Ballistic skill

            // A hit is scored if the D6 result is greater than 1 and equals or exceeds the ballistic skill
            if (rollResult > 1 && rollResult >= ballisticSkill) {
                successfulHits++;
            }
            // Critical Hit: An unmodified Hit roll of 6 always hits
            else if (rollResult == 6) {
                successfulHits++;
            }
        }
        return successfulHits;
    }

    // Method to get the total number of attacks based on the attack type
    private static int getAttacks(Object attackType) {
        if (attackType instanceof ATTACKS) {
            return ((ATTACKS) attackType).getAttacks();
        } else if (attackType instanceof D3ORD6ATTACKS) {
            return ((D3ORD6ATTACKS) attackType).getD3OrD6Attacks();
        } else {
            // Default to 0 attacks if the type is unknown
            return 0;
        }
    }
}

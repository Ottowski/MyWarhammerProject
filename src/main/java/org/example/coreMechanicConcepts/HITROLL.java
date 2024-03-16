package org.example.coreMechanicConcepts;

import org.example.entity.*;
import org.example.coreProfileWeaponStats.WEAPONSKILL;
import org.example.coreProfileWeaponStats.BALLISTICSKILL;
import org.example.utilities.SixSidedDice;

import static org.example.coreMechanicConcepts.BATTLEMECHANIC.random;
import org.example.utilities.RandomNumberGenerator;

public class HITROLL {

    public HITROLL(RandomNumberGenerator randomNumberGenerator) {
    }
    // Method to determine the number of successful hits for a melee attack
    public static int meleeAttackHit(Object meleeWeapon) {
        int successfulHits = 0;
        int totalAttacks = performAttackRolls(meleeWeapon); // Total number of attacks

        for (int i = 0; i < totalAttacks; i++) {
            int rollResult = SixSidedDice.roll(random);
            int weaponSkill = 0; // Default weapon skill

            // Check the type of melee weapon and get the corresponding weapon skill
            if (meleeWeapon instanceof AstartesMeleeWeaponEntity) {
                weaponSkill = ((AstartesMeleeWeaponEntity) meleeWeapon).getWeaponSkill().getWeaponSkill();
            } else if (meleeWeapon instanceof OrkMeleeWeaponEntity) {
                weaponSkill = ((OrkMeleeWeaponEntity) meleeWeapon).getWeaponSkill().getWeaponSkill();
            }

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

    // Method to determine the number of successful hits for a ranged attack
    public static int rangedAttackHit(Object rangedWeapon) {
        int successfulHits = 0;
        int totalAttacks = performAttackRolls(rangedWeapon); // Total number of attacks

        for (int i = 0; i < totalAttacks; i++) {
            int rollResult = SixSidedDice.roll(random);
            int ballisticSkill = 0; // Default ballistic skill

            // Check the type of ranged weapon and get the corresponding ballistic skill
            if (rangedWeapon instanceof AstartesRangedWeaponEntity) {
                ballisticSkill = ((AstartesRangedWeaponEntity) rangedWeapon).getBallisticSkill().getBallisticSkill();
            } else if (rangedWeapon instanceof AstartesPistolEntity) {
                ballisticSkill = ((AstartesPistolEntity) rangedWeapon).getBallisticSkill().getBallisticSkill();
            } else if (rangedWeapon instanceof AstartesSpecialRangedWeaponEntity) {
                ballisticSkill = ((AstartesSpecialRangedWeaponEntity) rangedWeapon).getBallisticSkill().getBallisticSkill();
            } else if (rangedWeapon instanceof OrkRangedWeaponEntity) {
                ballisticSkill = ((OrkRangedWeaponEntity) rangedWeapon).getBallisticSkill().getBallisticSkill();
            } else if (rangedWeapon instanceof OrksPistolEntity) {
                ballisticSkill = ((OrksPistolEntity) rangedWeapon).getBallisticSkill().getBallisticSkill();
            } else if (rangedWeapon instanceof OrkSpecialRangedWeaponEntity) {
                ballisticSkill = ((OrkSpecialRangedWeaponEntity) rangedWeapon).getBallisticSkill().getBallisticSkill();
            }

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

    // You may add other methods here...

    // Method to perform attack rolls - this needs to be implemented
    private static int performAttackRolls(Object weapon) {
        // You need to implement this method based on your requirements
        return 0;
    }

    // Method to determine the type of attack - this needs to be implemented
    public static boolean attacktype(WEAPONSKILL weaponSkill, BALLISTICSKILL ballisticSkill) {
        // You need to implement this method based on your requirements
        return false;
    }
}

package org.example.coreMechanicConcepts;
import org.example.coreProfileWeaponStats.WEAPONSKILL;
import org.example.coreProfileWeaponStats.BALLISTICSKILL;
import org.example.coreProfileWeaponStats.ATTACKS;
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
        int attacks = meleeWeapon.getAttacks().getAttacks(); // Total number of attacks
        int weaponSkill = meleeWeapon.getWeaponSkill().getWeaponSkill(); // Weapon skill

        for (int i = 0; i < attacks; i++) {
            int rollResult = rollDice();
            // A hit is scored if the D6 result equals or exceeds the weapon skill
            if (rollResult >= weaponSkill) {
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
        int attacks = rangedWeapon.getAttacks().getAttacks(); // Total number of attacks
        int ballisticSkill = rangedWeapon.getBallisticSkill().getBallisticSkill(); // Ballistic skill
        for (int i = 0; i < attacks; i++) {
            int rollResult = rollDice();
            // A hit is scored if the D6 result equals or exceeds the ballistic skill
            if (rollResult >= ballisticSkill) {
                successfulHits++;
            }
            // Critical Hit: An unmodified Hit roll of 6 always hits
            else if (rollResult == 6) {
                successfulHits++;
            }
        }
        return successfulHits;
    }
}
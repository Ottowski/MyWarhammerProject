package org.example.coreMechanicConcepts;

import org.example.coreProfileModellStats.SAVE;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.coreProfileWeaponStats.*;
import org.example.entity.*;
import org.example.utilities.SixSidedDice;

import java.util.Random;

public class BATTLEMECHANIC {
    static final Random random = new Random();

    // Method to roll a six-sided dice
    private static int rollDice() {
        return SixSidedDice.roll(random);
    }

    // Method to calculate damage inflicted based on the Damage characteristic of the attack
    public static int calculateDamage(Object damageCharacteristic) {
        if (damageCharacteristic instanceof DAMAGE) {
            return calculateDamageFromNormal((DAMAGE) damageCharacteristic);
        } else if (damageCharacteristic instanceof D3ORD6DAMAGE) {
            return calculateDamageFromD3OrD6((D3ORD6DAMAGE) damageCharacteristic);
        } else {
            throw new IllegalArgumentException("Unsupported damage characteristic type");
        }
    }

    // Method to calculate damage inflicted based on the Damage characteristic (always 1)
    private static int calculateDamageFromNormal(DAMAGE damageCharacteristic) {
        return 1; // Normal damage always inflicts 1 damage
    }

    // Method to calculate damage inflicted based on the D3ORD6DAMAGE characteristic (1 to 3 or 1 to 6)
    private static int calculateDamageFromD3OrD6(D3ORD6DAMAGE damageCharacteristic) {
        return damageCharacteristic.getD3OrD6Damage();
    }

    // Method to get the total number of attacks based on the attack type
    // Method to get the total number of attacks based on the attack type
    public static int performAttackRolls(WEAPONSKILL weaponSkill, BALLISTICSKILL ballisticSkill, ATTACKS attacks, D3ORD6ATTACKS d3ORD6ATTACKS) {
        int successfulHits = 0;
        // Check if the attacks are of type ATTACKS or D3ORD6ATTACKS
        if (attacks != null) {
            return attacks.getAttacks(); // Return the number of attacks
        } else if (d3ORD6ATTACKS != null) {
            return d3ORD6ATTACKS.getD3OrD6Attacks(); // Return the number of D3 or D6 attacks
        }

        // The following code is reachable only if neither attacks nor d3ORD6ATTACKS is null
        for (int i = 0; i < successfulHits; i++) {
            // Perform wound roll for each successful hit
            if (HITROLL.attacktype(weaponSkill, ballisticSkill)) {
                successfulHits++;
            }
        }
        return successfulHits;
    }

    // Method to perform wound rolls based on the number of successful hits
    public static int performWoundRolls(int successfulHits, STRENGTH strength, TOUGHNESS toughness, Object entity) {
        int successfulWounds = 0;
        for (int i = 0; i < successfulHits; i++) {
            // Perform wound roll for each successful hit
            if (WOUNDROLL.woundRoll(strength, toughness)) {
                successfulWounds++;
            }
        }
        return successfulWounds;
    }

    // Method to perform saving throws for each successful wound roll
    public static int performSavingThrows(int successfulWounds, SAVE save, Object entity) {
        int successfulSaves = 0;
        for (int i = 0; i < successfulWounds; i++) {
            // Perform saving throw for each successful wound
            if (SAVINGTHROW.saveRoll(save)) {
                successfulSaves++;
            }
        }
        return successfulSaves;
    }

    // Method to get the ATTACKS value from the specified melee weapon
    private static int getAttacksFromMeleeWeapons(Object entity) {
        return switch (entity) {
            case AstartesMeleeWeaponEntity astartesMeleeWeapon -> astartesMeleeWeapon.getAttacks().getAttacks();
            case OrkMeleeWeaponEntity orkMeleeWeapon -> orkMeleeWeapon.getAttacks().getAttacks();
            default -> 0; // Default to 0 attacks if the entity type is unknown
        };
    }

    // Method to get the D3ORD6ATTACKS value from the specified melee weapon
    private static int getD3OrD6AttacksFromMeleeWeapons(Object entity) {
        return switch (entity) {
            case AstartesMeleeWeaponEntity astartesMeleeWeapon -> astartesMeleeWeapon.getD3OrD6Attacks().getD3OrD6Attacks();
            case OrkMeleeWeaponEntity orkMeleeWeapon -> orkMeleeWeapon.getD3OrD6Attacks().getD3OrD6Attacks();
            default -> 0; // Default to 0 attacks if the entity type is unknown
        };
    }


    // Method to get the ATTACKS value from the specified ranged weapon
    private static int getAttacksFromRangedWeapons(Object entity) {
        return switch (entity) {
            case AstartesRangedWeaponEntity astartesRangedWeapon -> astartesRangedWeapon.getAttacks().getAttacks();
            case AstartesPistolEntity astartesPistol -> astartesPistol.getAttacks().getAttacks();
            case AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeapon -> astartesSpecialRangedWeapon.getAttacks().getAttacks();
            case OrkRangedWeaponEntity orkRangedWeapon -> orkRangedWeapon.getAttacks().getAttacks();
            case OrksPistolEntity orksPistol -> orksPistol.getAttacks().getAttacks();
            case OrkSpecialRangedWeaponEntity orkSpecialRangedWeapon -> orkSpecialRangedWeapon.getAttacks().getAttacks();
            default -> 0; // Default to 0 attacks if the entity type is unknown
        };
    }

    // Method to get the D3ORD6ATTACKS value from the specified ranged weapon
    private static int getD3OrD6AttacksFromRangedWeapons(Object entity) {
        return switch (entity) {
            case AstartesRangedWeaponEntity astartesRangedWeapon -> astartesRangedWeapon.getD3OrD6Attacks().getD3OrD6Attacks();
            case AstartesPistolEntity astartesPistol -> astartesPistol.getD3OrD6Attacks().getD3OrD6Attacks();
            case AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeapon -> astartesSpecialRangedWeapon.getD3OrD6Attacks().getD3OrD6Attacks();
            case OrkRangedWeaponEntity orkRangedWeapon -> orkRangedWeapon.getD3OrD6Attacks().getD3OrD6Attacks();
            case OrkSpecialRangedWeaponEntity orkSpecialRangedWeapon -> orkSpecialRangedWeapon.getD3OrD6Attacks().getD3OrD6Attacks();
            default -> 0; // Default to 0 attacks if the entity type is unknown
        };
    }

    // Method to get the SAVE value from the specified entity
    private static int getSaveFromEntity(Object entity) {
        return switch (entity) {
            case AstartesInfantryEntity astartesInfantryEntity -> astartesInfantryEntity.getSave().getSave();
            case AstartesInfantryLeaderEntity astartesInfantryLeaderEntity -> astartesInfantryLeaderEntity.getSave().getSave();
            case OrkInfantryEntity orkInfantryEntity -> orkInfantryEntity.getSave().getSave();
            case OrkInfantryLeaderEntity orkInfantryLeaderEntity -> orkInfantryLeaderEntity.getSave().getSave();
            default -> 0; // Default to 0 save if the entity type is unknown
        };
    }

    // Method to get the TOUGHNESS value from the specified entity
    private static int getToughnessFromEntity(Object entity) {
        return switch (entity) {
            case AstartesInfantryEntity astartesInfantryEntity -> astartesInfantryEntity.getToughness().getToughness();
            case AstartesInfantryLeaderEntity astartesInfantryLeaderEntity -> astartesInfantryLeaderEntity.getToughness().getToughness();
            case OrkInfantryEntity orkInfantryEntity -> orkInfantryEntity.getToughness().getToughness();
            case OrkInfantryLeaderEntity orkInfantryLeaderEntity -> orkInfantryLeaderEntity.getToughness().getToughness();
            default -> 0; // Default to 0 toughness if the entity type is unknown
        };
    }
}

package org.example.coreMechanicConcepts;
import org.example.coreProfileModellStats.SAVE;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.coreProfileWeaponStats.ATTACKS;
import org.example.coreProfileWeaponStats.D3ORD6ATTACKS;
import org.example.coreProfileWeaponStats.STRENGTH;
import org.example.entity.AstartesInfantryEntity;
import org.example.entity.AstartesInfantryLeaderEntity;
import org.example.entity.OrkInfantryEntity;
import org.example.entity.OrkInfantryLeaderEntity;
import org.example.coreMechanicConcepts.SAVINGTHROW;
import org.example.coreMechanicConcepts.WOUNDROLL;
import org.example.coreMechanicConcepts.HITROLL;
public class BATTLEMECHANIC {
    // Method to get the total number of attacks based on the attack type
    static int performAttackRolls(Object attackType) {
        if (attackType instanceof ATTACKS) {
            return ((ATTACKS) attackType).getAttacks();
        } else if (attackType instanceof D3ORD6ATTACKS) {
            return ((D3ORD6ATTACKS) attackType).getD3OrD6Attacks();
        } else {
            // Default to 0 attacks if the type is unknown
            return 0;
        }
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
    public static int performSavingThrows(int successfulWounds, SAVE save) {
        int successfulSaves = 0;
        for (int i = 0; i < successfulWounds; i++) {
            // Perform saving throw for each successful wound
            if (SAVINGTHROW.saveRoll(save)) {
                successfulSaves++;
            }
        }
        return successfulSaves;
    }
    // Method to get the toughness value from the specified entity
    private static int getToughnessFromEntity(Object entity) {
        return switch (entity) {
            case AstartesInfantryEntity astartesInfantryEntity -> astartesInfantryEntity.getToughness().getToughness();
            case AstartesInfantryLeaderEntity astartesInfantryLeaderEntity -> astartesInfantryLeaderEntity.getToughness().getToughness();
            case OrkInfantryEntity orkInfantryEntity -> orkInfantryEntity.getToughness().getToughness();
            case OrkInfantryLeaderEntity orkInfantryLeaderEntity -> orkInfantryLeaderEntity.getToughness().getToughness();
            case null, default ->
                // Default to 0 toughness if the entity type is unknown
                    0;
        };
    }
}

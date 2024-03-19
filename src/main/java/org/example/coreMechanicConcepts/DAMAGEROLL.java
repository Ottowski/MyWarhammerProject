package org.example.coreMechanicConcepts;
import org.example.coreProfileWeaponStats.D3ORD6DAMAGE;
import org.example.coreProfileWeaponStats.DAMAGE;
public class DAMAGEROLL {
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
}

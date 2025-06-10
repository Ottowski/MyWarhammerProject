import org.example.coreProfileWeaponStats.D3ORD6DAMAGE;
import org.example.coreProfileWeaponStats.DAMAGE;
import org.example.coreMechanicConcepts.DAMAGEROLL;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDamageRoll {

    @Test
    public void testCalculateDamageNormal() {
        // Test with normal damage characteristic
        DAMAGE damageCharacteristic = new DAMAGE(0);
        int result = DAMAGEROLL.calculateDamage(damageCharacteristic);
        assertEquals("Damage should be equal to 1 for normal damage", 1, result);
    }

    @Test
    public void testCalculateDamageD3() {
        // Test with D3 damage characteristic
        D3ORD6DAMAGE damageCharacteristic = new D3ORD6DAMAGE(3); // D3 damage
        int result = DAMAGEROLL.calculateDamage(damageCharacteristic);
        assertTrue("Damage should be between 1 and 3 for D3 damage", result >= 1 && result <= 3);
    }

    @Test
    public void testCalculateDamageD6() {
        // Test with D6 damage characteristic
        D3ORD6DAMAGE damageCharacteristic = new D3ORD6DAMAGE(6); // D6 damage
        int result = DAMAGEROLL.calculateDamage(damageCharacteristic);
        assertTrue("Damage should be between 1 and 6 for D6 damage", result >= 1 && result <= 6);
    }
}

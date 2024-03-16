import org.example.coreMechanicConcepts.WOUNDROLL;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.coreProfileWeaponStats.STRENGTH;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestWoundRoll {

    @Test
    public void testSuccessfulWoundRoll() {
        STRENGTH strength = new STRENGTH(4); // Example strength
        TOUGHNESS toughness = new TOUGHNESS(3); // Example toughness
        boolean result = WOUNDROLL.woundRoll(strength, toughness);
        assertTrue("Wound roll should be successful", result);
    }

    @Test
    public void testFailedWoundRoll() {
        STRENGTH strength = new STRENGTH(3); // Example strength
        TOUGHNESS toughness = new TOUGHNESS(4); // Example toughness
        boolean result = WOUNDROLL.woundRoll(strength, toughness);
        assertFalse("Wound roll should fail", result);
    }
}

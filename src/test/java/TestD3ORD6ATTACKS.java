//package org.example.coreProfileWeaponStats;
import org.example.coreProfileWeaponStats.D3ORD6DAMAGE;
import org.junit.Test;

import org.example.coreProfileWeaponStats.D3ORD6ATTACKS;

import static org.junit.Assert.*;

public class TestD3ORD6ATTACKS {

    @Test
    public void testD3Attacks() {
        D3ORD6ATTACKS d3Attacks = new D3ORD6ATTACKS(3);
        int result = d3Attacks.getD3OrD6Attacks();
        assertTrue("Result should be between 1 and 3 for D3 attacks", result >= 1 && result <= 3);
    }

    @Test
    public void testD6Attacks() {
        D3ORD6ATTACKS d6Attacks = new D3ORD6ATTACKS(6);
        int result = d6Attacks.getD3OrD6Attacks();
        assertTrue("Result should be between 1 and 6 for D6 attacks", result >= 1 && result <= 6);
    }

    @Test
    public void testOtherTrueValues() {
        // Test with a value other than 3 or 6
        D3ORD6ATTACKS otherAttacks = new D3ORD6ATTACKS(4);
        int result = otherAttacks.getD3OrD6Attacks();
        assertEquals("Result should be the same as the input for other values", 4, result);
    }

    @Test
    public void testOtherFalseValues() {
        // Test with a value higher than 6
        D3ORD6ATTACKS otherFalseAttacks = new D3ORD6ATTACKS(7);
        int result = otherFalseAttacks.getD3OrD6Attacks();
        assertFalse("Result should be incorrect for values higher than 6", result > 7);
    }
}

import org.example.coreMechanicConcepts.BATTLEMECHANIC;
import org.example.coreProfileModellStats.SAVE;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.coreProfileWeaponStats.ATTACKS;
import org.example.coreProfileWeaponStats.D3ORD6ATTACKS;
import org.example.coreProfileWeaponStats.STRENGTH;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class TestBattleMechanic {

    @Test
    public void testPerformAttackRolls_Attacks() {
        // Mocked values
        int expectedAttacks = 5;
        ATTACKS mockedAttacks = mock(ATTACKS.class);
        when(mockedAttacks.getAttacks()).thenReturn(expectedAttacks);

        // Perform the attack rolls
        int result = BATTLEMECHANIC.performAttackRolls(null, null, mockedAttacks, null);

        // Verify that the result matches the expected number of attacks
        assertEquals("Number of attacks should match", expectedAttacks, result);
    }

    @Test
    public void testPerformAttackRolls_D3ORD6Attacks() {
        // Mocked values
        int expectedD3ORD6Attacks = 3;
        D3ORD6ATTACKS mockedD3ORD6Attacks = mock(D3ORD6ATTACKS.class);
        when(mockedD3ORD6Attacks.getD3OrD6Attacks()).thenReturn(expectedD3ORD6Attacks);

        // Perform the attack rolls
        int result = BATTLEMECHANIC.performAttackRolls(null, null, null, mockedD3ORD6Attacks);

        // Verify that the result matches the expected number of D3 or D6 attacks
        assertEquals("Number of D3 or D6 attacks should match", expectedD3ORD6Attacks, result);
    }

    @Test
    public void testPerformWoundRolls() {
        // Mocked values
        int successfulHits = 5; // For example, 5 successful hits
        STRENGTH strength = new STRENGTH(4); // Example strength value
        TOUGHNESS toughness = new TOUGHNESS(3); // Example toughness value

        // Perform the wound rolls
        int result = BATTLEMECHANIC.performWoundRolls(successfulHits, strength, toughness, null);

        // In this example, all hits should result in successful wounds, so the result should be the same as the number of hits
        assertEquals("Number of successful wounds should match the number of hits", successfulHits, result);
    }

    @Test
    public void testPerformSavingThrows() {
        // Mocked values
        int successfulWounds = 3; // For example, 3 successful wounds
        SAVE mockedSave = mock(SAVE.class);
        when(mockedSave.getSave()).thenReturn(4); // Example save value

        // Perform the saving throws
        int result = BATTLEMECHANIC.performSavingThrows(successfulWounds, mockedSave, null);

        // Verify that the result matches the number of successful wounds
        assertEquals("Number of successful saves should match the number of successful wounds", successfulWounds, result);
    }
}

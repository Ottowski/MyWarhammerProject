import org.example.coreProfileWeaponStats.D3ORD6DAMAGE;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestD3ORD6DAMAGE {

    @Test
    public void testD3Damage() {
        D3ORD6DAMAGE d3Damage = new D3ORD6DAMAGE(3);
        int result = d3Damage.getD3OrD6Damage();
        assertTrue("Result should be between 1 and 3 for D3 damage", result >= 1 && result <= 3);
    }

    @Test
    public void testD6Damage() {
        D3ORD6DAMAGE d6Damage = new D3ORD6DAMAGE(6);
        int result = d6Damage.getD3OrD6Damage();
        assertTrue("Result should be between 1 and 6 for D6 damage", result >= 1 && result <= 6);
    }

    @Test
    public void testOtherTrueValues() {
        // Test with a value other than 3 or 6
        D3ORD6DAMAGE otherTrueDamage = new D3ORD6DAMAGE(4);
        int result = otherTrueDamage.getD3OrD6Damage();
        assertTrue("Result should be the same as the input for other values", result == 4);
    }

    @Test
    public void testOtherFalseValues() {
        // Test with a value higher than 6
        D3ORD6DAMAGE otherFalseDamage = new D3ORD6DAMAGE(7);
        int result = otherFalseDamage.getD3OrD6Damage();
        assertFalse("Result should be incorrect for values higher than 6", result > 7);
    }
}

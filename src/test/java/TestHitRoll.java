import org.example.coreMechanicConcepts.HITROLL;
import org.example.coreProfileWeaponStats.BALLISTICSKILL;
import org.example.coreProfileWeaponStats.WEAPONSKILL;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHitRoll {

    @Test
    public void testMeleeAttackHit() {
        WEAPONSKILL weaponSkill = new WEAPONSKILL(4); // Example weapon skill
        int hits = HITROLL.meleeAttackHit(weaponSkill);
        assertEquals("Number of successful hits for melee attack should be 0 or positive", 0, hits);
    }

    @Test
    public void testRangedAttackHit() {
        BALLISTICSKILL ballisticSkill = new BALLISTICSKILL(3); // Example ballistic skill
        int hits = HITROLL.rangedAttackHit(ballisticSkill);
        assertEquals("Number of successful hits for ranged attack should be 0 or positive", 0, hits);
    }
}

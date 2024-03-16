import org.example.coreMechanicConcepts.SAVINGTHROW;
import org.example.coreProfileModellStats.SAVE;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSavingThrow {

    @Test
    public void testSuccessfulSavingThrow() {
        SAVE save = new SAVE(4); // Example save characteristic
        boolean result = SAVINGTHROW.saveRoll(save);
        assertTrue("Saving throw test should be successful", result);
    }

    @Test
    public void testFailedSavingThrow() {
        SAVE save = new SAVE(3); // Example save characteristic
        boolean result = SAVINGTHROW.saveRoll(save);
        assertFalse("Saving throw test should fail", result);
    }
}

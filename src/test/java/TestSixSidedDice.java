import org.example.utilities.SixSidedDice;
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSixSidedDice {

    @Test
    public void testRoll() {
        // Creating a set to store the results
        Set<Integer> resultSet = new HashSet<>();

        // Rolling the dice multiple times and storing the results
        for (int i = 0; i < 1000; i++) {
            int rollResult = SixSidedDice.roll(new Random());
            // Asserting that the result is between 1 and 6 (inclusive)
            assertTrue("Dice roll result cannot be less than 1. Result: " + rollResult, rollResult >= 1);
            assertTrue("Dice roll result cannot be greater than 6. Result: " + rollResult, rollResult <= 6);
            resultSet.add(rollResult);
        }

        // Asserting that the set contains numbers 1 to 6 only
        assertEquals("Dice roll result set size should be 6", 6, resultSet.size());
        for (int i = 1; i <= 6; i++) {
            assertTrue("Dice roll result set should contain " + i, resultSet.contains(i));
        }
    }
}

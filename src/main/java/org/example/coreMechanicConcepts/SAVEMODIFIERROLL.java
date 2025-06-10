package org.example.coreMechanicConcepts;

import org.example.coreProfileModellStats.SAVE;
import org.example.coreProfileWeaponStats.ARMORPENETRATION;
import org.example.utilities.SixSidedDice;

import java.util.Random;

public class SAVEMODIFIERROLL {

    static final Random random = new Random();

    public static boolean modifiedSaveRoll(SAVE save, ARMORPENETRATION ap) {
        int modifiedSaveValue = save.getSave() + ap.getArmorPenetration();

        int rollResult = SixSidedDice.roll(random);
        return rollResult >= modifiedSaveValue;
    }
}

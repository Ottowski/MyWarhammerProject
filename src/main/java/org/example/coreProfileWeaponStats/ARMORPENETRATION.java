package org.example.coreProfileWeaponStats;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ARMORPENETRATION {
    private int armorpenetration;

    public ARMORPENETRATION(int armorpenetration) {
        this.armorpenetration = armorpenetration;
    }

    public int getArmorPenetration() {
        return armorpenetration;
    }
}
package org.example.coreProfileWeaponStats;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RANGE {
    private int range;
    public RANGE(int range) {
        this.range = range;
    }
}
package org.example.coreProfileWeaponStats;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BALLISTICSKILL {
    private int ballisticSkill;

    // Constructor that accepts an int argument
    public BALLISTICSKILL(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }
}

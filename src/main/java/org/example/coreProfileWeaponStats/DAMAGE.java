package org.example.coreProfileWeaponStats;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DAMAGE {
    private int damage;
    public DAMAGE(int damage) {
        this.damage = damage;
    }
}
package org.example.coreProfileWeaponStats;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public class D3ORD6DAMAGE {
    private int d3ord6damage;
    public D3ORD6DAMAGE(int d3ord6damage) {
        this.d3ord6damage = d3ord6damage;
    }
    public int getD3OrD6Damage() {
        // If the value is 3, it's treated as D3. If it's 6, it's treated as D6.
        if (d3ord6damage== 3 || d3ord6damage == 6) {
            return rollD3OrD6();
        } else {
            return d3ord6damage; // Return the original value for other cases
        }
    }

    private int rollD3OrD6() {
        Random random = new Random();
        // For D3, roll a three-sided dice
        if (d3ord6damage == 3) {
            return random.nextInt(3) + 1;
        }
        // For D6, roll a six-sided dice
        else {
            return random.nextInt(6) + 1;
        }
    }
}
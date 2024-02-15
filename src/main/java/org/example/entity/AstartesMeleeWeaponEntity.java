package org.example.entity;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AstartesMeleeWeaponEntity {
    private int id;

    private String name;
    private int attacks;
    private int D3OrD6Attacks;
    private int weaponSkill;
    private int strength;
    private int armorpenetration;
    private int damage;
    private int D3OrD6Damage;
}

package org.example.entity;
import lombok.*;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrkSpecialRangedWeaponEntity {
    private Long id;
    private String name;
    private int range;
    private int attacks;
    private int D3OrD6Attacks;
    private int ballisticSkill;
    private int strength;
    private int armorpenetration;
    private int damage;
    private int D3OrD6Damage;
}

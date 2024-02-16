package org.example.entity;
import org.example.coreProfileWeaponStats.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrkSpecialRangedWeaponEntity {
    private int id;
    private String specialRangedWeaponName;
    private RANGE range;
    private ATTACKS attacks;
    private D3ORD6ATTACKS D3OrD6Attacks;
    private BALLISTICSKILL ballisticSkill;
    private STRENGTH strength;
    private ARMORPENETRATION armorpenetration;
    private DAMAGE damage;
    private D3ORD6DAMAGE D3OrD6Damage;
}
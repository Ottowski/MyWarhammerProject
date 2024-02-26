package org.example.entity;
import lombok.*;
import org.example.coreProfileWeaponStats.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SuperchargeWeaponVersionEntity {
    private int id;
    private NAMEWEAPON superchargeWeaponName;
    private RANGE range;
    private ATTACKS attacks;
    private D3ORD6ATTACKS D3OrD6Attacks;
    private BALLISTICSKILL ballisticSkill;
    private STRENGTH strength;
    private ARMORPENETRATION armorpenetration;
    private DAMAGE damage;
    private D3ORD6DAMAGE D3OrD6Damage;
}
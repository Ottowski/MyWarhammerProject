package org.example.entity;
import org.example.coreProfileWeaponStats.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrkMeleeWeaponEntity {
    private int id;
    private NAMEWEAPON meleeWeaponName;
    private ATTACKS attacks;
    private D3ORD6ATTACKS D3OrD6Attacks;
    private WEAPONSKILL weaponSkill;
    private STRENGTH strength;
    private ARMORPENETRATION armorpenetration;
    private DAMAGE damage;
    private D3ORD6DAMAGE D3OrD6Damage;
}
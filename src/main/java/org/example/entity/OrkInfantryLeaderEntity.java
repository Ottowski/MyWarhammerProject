package org.example.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrkInfantryLeaderEntity {

    private Long id;
    private String unitLeaderName;
    private int movement;
    private int toughness;
    private int wounds;
    private int save;
    private int meleeWeapon;
    private int rangedWeapon;
    private int pistol;
    private int specialUnitRangedWeapon;
}

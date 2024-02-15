package org.example.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AstartesInfantryEntity {

    private int id;
    private String unitName;
    private int unitLeader;
    private int unitSize;
    private int movement;
    private int toughness;
    private int wounds;
    private int save;
    private int meleeWeapon;
    private int rangedWeapon;
    private int pistol;
    private int specialUnitRangedWeapon;
}



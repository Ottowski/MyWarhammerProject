package org.example.entity;
import lombok.*;
import org.example.coreProfileModellStats.MOVEMENT;
import org.example.coreProfileModellStats.SAVE;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.coreProfileModellStats.WOUNDS;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrkInfantryLeaderEntity {
    private int id;
    private String unitLeaderName;
    private MOVEMENT movement;
    private TOUGHNESS toughness;
    private WOUNDS wounds;
    private SAVE save;
    private int meleeWeapon;
    private int rangedWeapon;
    private int pistol;
    private int specialUnitRangedWeapon;
}
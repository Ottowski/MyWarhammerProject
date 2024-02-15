package org.example.entity;
import lombok.*;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AstartesInfantryLeaderEntity {

    private int id;

    private String name;
    private int movement;
    private int toughness;
    private int wounds;
    private int save;
    private int meleeWeapon;
    private int rangedWeapon;
    private int pistol;
}
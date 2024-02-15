package org.example.repository;
import org.example.entity.AstartesSpecialRangedWeaponEntity;
import java.util.List;
public interface AstartesSpecialRangedWeaponRepository {


    AstartesSpecialRangedWeaponEntity get(int id);
    void add(AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeaponEntity);
    void update(AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeaponEntity);
    void remove(AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeaponEntity);

    List<AstartesSpecialRangedWeaponEntity> getAllAstartesSpecialRangedWeapon();
}
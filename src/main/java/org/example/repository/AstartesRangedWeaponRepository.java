package org.example.repository;
import org.example.entity.AstartesRangedWeaponEntity;

import java.util.List;

public interface AstartesRangedWeaponRepository {


    AstartesRangedWeaponEntity get(int id);
    void add(AstartesRangedWeaponEntity astartesRangedWeaponEntity);
    void update(AstartesRangedWeaponEntity astartesRangedWeaponEntity);
    void remove(AstartesRangedWeaponEntity astartesRangedWeaponEntity);

    List<AstartesRangedWeaponEntity> getAllAstartesRangedWeapon();
}


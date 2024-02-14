package org.example.repository;
import org.example.entity.AstartesRangedWeaponEntity;

import java.util.List;

public interface AstartesRangedWeaponRepository {


    AstartesRangedWeaponEntity get(Long id);
    void add(AstartesRangedWeaponEntity astartesrangedweaponentity);
    void update(AstartesRangedWeaponEntity astartesrangedweaponentity);
    void remove(AstartesRangedWeaponEntity astartesrangedweaponentity);

    List<AstartesRangedWeaponEntity> getAllAstartesRangedWeapon();
}


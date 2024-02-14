package org.example.repository;
import org.example.entity.AstartesMeleeWeaponEntity;

import java.util.List;

public interface AstartesMeleeWeaponRepository {


    AstartesMeleeWeaponEntity get(Long id);
    void add(AstartesMeleeWeaponEntity astartesmeleeweaponentity);
    void update(AstartesMeleeWeaponEntity astartesmeleeweaponentity);
    void remove(AstartesMeleeWeaponEntity astartesmeleeweaponentity);

    List<AstartesMeleeWeaponEntity> getAllAstartesMeleeWeapon();
}


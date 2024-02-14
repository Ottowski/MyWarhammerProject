package org.example.repository.orkrangedweaponrepo;
import org.example.entity.OrkRangedWeaponEntity;

import java.util.List;

public interface OrkRangedWeaponRepository {


    OrkRangedWeaponEntity get(Long id);
    void add(OrkRangedWeaponEntity orkrangedweaponentity);
    void update(OrkRangedWeaponEntity orkrangedweaponentity);
    void remove(OrkRangedWeaponEntity orkrangedweaponentity);

    List<OrkRangedWeaponEntity> getAllOrkRangedWeapon();
}


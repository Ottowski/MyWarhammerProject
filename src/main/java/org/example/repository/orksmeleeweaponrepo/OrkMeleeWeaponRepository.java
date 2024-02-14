package org.example.repository.orksmeleeweaponrepo;

import org.example.entity.OrkMeleeWeaponEntity;

import java.util.List;

public interface OrkMeleeWeaponRepository {


    OrkMeleeWeaponEntity get(Long id);
    void add(OrkMeleeWeaponEntity orkmeleeweaponentity);
    void update(OrkMeleeWeaponEntity orkmeleeweaponentity);
    void remove(OrkMeleeWeaponEntity orkmeleeweaponentity);

    List<OrkMeleeWeaponEntity> getAllOrkMeleeWeapon();
}

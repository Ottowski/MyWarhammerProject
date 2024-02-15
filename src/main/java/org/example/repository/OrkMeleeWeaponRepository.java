package org.example.repository;
import org.example.entity.OrkMeleeWeaponEntity;
import java.util.List;
public interface OrkMeleeWeaponRepository {
    OrkMeleeWeaponEntity get(int id);
    void add(OrkMeleeWeaponEntity orkMeleeWeaponEntity);
    void update(OrkMeleeWeaponEntity orkMeleeWeaponEntity);
    void remove(OrkMeleeWeaponEntity orkMeleeWeaponEntity);
    List<OrkMeleeWeaponEntity> getAllOrkMeleeWeapon();
}
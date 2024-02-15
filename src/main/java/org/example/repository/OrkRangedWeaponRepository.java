package org.example.repository;
import org.example.entity.OrkRangedWeaponEntity;
import java.util.List;
public interface OrkRangedWeaponRepository {
    OrkRangedWeaponEntity get(int id);
    void add(OrkRangedWeaponEntity orkRangedWeaponEntity);
    void update(OrkRangedWeaponEntity orkRangedWeaponEntity);
    void remove(OrkRangedWeaponEntity orkRangedWeaponEntity);
    List<OrkRangedWeaponEntity> getAllOrkRangedWeapon();
}
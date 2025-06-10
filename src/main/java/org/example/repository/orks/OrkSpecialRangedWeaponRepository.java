package org.example.repository.orks;
import org.example.entity.OrkSpecialRangedWeaponEntity;
import java.util.List;
public interface OrkSpecialRangedWeaponRepository {
    OrkSpecialRangedWeaponEntity get(int id);
    void add(OrkSpecialRangedWeaponEntity orkSpecialRangedWeaponEntity);
    void update(OrkSpecialRangedWeaponEntity orkSpecialRangedWeaponEntity);
    void remove(OrkSpecialRangedWeaponEntity orkSpecialRangedWeaponEntity);
    List<OrkSpecialRangedWeaponEntity> getAllOrkSpecialRangedWeapon();
}
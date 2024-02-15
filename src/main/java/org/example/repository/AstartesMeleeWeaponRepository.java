package org.example.repository;
import org.example.entity.AstartesMeleeWeaponEntity;
import java.util.List;
public interface AstartesMeleeWeaponRepository {
    AstartesMeleeWeaponEntity get(int id);
    void add(AstartesMeleeWeaponEntity astartesMeleeWeaponEntity);
    void update(AstartesMeleeWeaponEntity astartesMeleeWeaponEntity);
    void remove(AstartesMeleeWeaponEntity astartesMeleeWeaponEntity);
    List<AstartesMeleeWeaponEntity> getAllAstartesMeleeWeapon();
}
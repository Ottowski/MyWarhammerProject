package org.example.repository;
import org.example.entity.SuperchargeWeaponVersionEntity;
import java.util.List;
public interface SuperchargeWeaponVersionRepository {
    SuperchargeWeaponVersionEntity get(int id);
    void add(SuperchargeWeaponVersionEntity superchargeWeaponVersionEntity);
    void update(SuperchargeWeaponVersionEntity superchargeWeaponVersionEntity);
    void remove(SuperchargeWeaponVersionEntity superchargeWeaponVersionEntity);
    List<SuperchargeWeaponVersionEntity> getAllSuperchargeWeaponVersion();
}
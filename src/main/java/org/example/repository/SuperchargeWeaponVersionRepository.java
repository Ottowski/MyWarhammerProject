package org.example.repository;
import org.example.entity.SuperchargeWeaponVersionEntity;
import java.util.List;
public interface SuperchargeWeaponVersionRepository {


    SuperchargeWeaponVersionEntity get(Long id);
    void add(SuperchargeWeaponVersionEntity superchargeWeaponVersionEntity);
    void update(SuperchargeWeaponVersionEntity superchargeWeaponVersionEntity);
    void remove(SuperchargeWeaponVersionEntity superchargeWeaponVersionEntity);

    List<SuperchargeWeaponVersionEntity> getAllSuperchargeWeaponVersion();
}
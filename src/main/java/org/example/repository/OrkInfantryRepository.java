package org.example.repository;
import org.example.entity.OrkInfantryEntity;

import java.util.List;

public interface OrkInfantryRepository {


    OrkInfantryEntity get(int id);
    void add(OrkInfantryEntity orkInfantryEntity);
    void update(OrkInfantryEntity orkInfantryEntity);
    void remove(OrkInfantryEntity orkInfantryEntity);

    List<OrkInfantryEntity> getAllOrkInfantry();
}

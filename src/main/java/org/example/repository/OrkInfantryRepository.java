package org.example.repository;
import org.example.entity.OrkInfantryEntity;

import java.util.List;

public interface OrkInfantryRepository {


    OrkInfantryEntity get(Long id);
    void add(OrkInfantryEntity orkinfantryentity);
    void update(OrkInfantryEntity orkinfantryentity);
    void remove(OrkInfantryEntity orkinfantryentity);

    List<OrkInfantryEntity> getAllOrkInfantry();
}

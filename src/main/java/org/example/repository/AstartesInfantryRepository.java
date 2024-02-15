package org.example.repository;

import org.example.entity.AstartesInfantryEntity;

import java.util.List;

public interface AstartesInfantryRepository {


    AstartesInfantryEntity get(Long id);
    void add(AstartesInfantryEntity astartesInfantryEntity);
    void update(AstartesInfantryEntity astartesInfantryEntity);
    void remove(AstartesInfantryEntity astartesInfantryEntity);

    List<AstartesInfantryEntity> getAllAstartesInfantry();
}

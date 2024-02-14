package org.example.repository.astartesinfantryrepo;

import org.example.entity.AstartesInfantryEntity;

import java.util.List;

public interface AstartesInfantryRepository {


    AstartesInfantryEntity get(Long id);
    void add(AstartesInfantryEntity astartesinfantryentity);
    void update(AstartesInfantryEntity astartesinfantryentity);
    void remove(AstartesInfantryEntity astartesinfantryentity);

    List<AstartesInfantryEntity> getAllAstartesInfantry();
}

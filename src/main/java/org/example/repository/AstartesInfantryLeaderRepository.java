package org.example.repository;

import org.example.entity.AstartesInfantryLeaderEntity;

import java.util.List;

public interface AstartesInfantryLeaderRepository {


    AstartesInfantryLeaderEntity get(Long id);
    void add(AstartesInfantryLeaderEntity astartesInfantryLeaderEntity);
    void update(AstartesInfantryLeaderEntity astartesInfantryLeaderEntity);
    void remove(AstartesInfantryLeaderEntity astartesInfantryLeaderEntity);

    List<AstartesInfantryLeaderEntity> getAllAstartesInfantryLeader();
}

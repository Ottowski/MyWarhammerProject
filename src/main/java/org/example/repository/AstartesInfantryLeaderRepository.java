package org.example.repository;

import org.example.entity.AstartesInfantryLeaderEntity;

import java.util.List;

public interface AstartesInfantryLeaderRepository {


    AstartesInfantryLeaderEntity get(Long id);
    void add(AstartesInfantryLeaderEntity astartesinfantryleaderentity);
    void update(AstartesInfantryLeaderEntity astartesinfantryleaderentity);
    void remove(AstartesInfantryLeaderEntity astartesinfantryleaderentity);

    List<AstartesInfantryLeaderEntity> getAllAstartesInfantryLeader();
}

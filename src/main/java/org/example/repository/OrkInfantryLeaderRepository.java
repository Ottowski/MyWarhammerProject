package org.example.repository;
import org.example.entity.OrkInfantryLeaderEntity;

import java.util.List;

public interface OrkInfantryLeaderRepository {


    OrkInfantryLeaderEntity get(int id);
    void add(OrkInfantryLeaderEntity orkInfantryLeaderEntity);
    void update(OrkInfantryLeaderEntity orkInfantryLeaderEntity);
    void remove(OrkInfantryLeaderEntity orkInfantryLeaderEntity);

    List<OrkInfantryLeaderEntity> getAllOrkInfantryLeader();
}


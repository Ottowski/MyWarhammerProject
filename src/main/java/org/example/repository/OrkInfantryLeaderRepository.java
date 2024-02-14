package org.example.repository;
import org.example.entity.OrkInfantryLeaderEntity;

import java.util.List;

public interface OrkInfantryLeaderRepository {


    OrkInfantryLeaderEntity get(Long id);
    void add(OrkInfantryLeaderEntity orkinfantryleaderentity);
    void update(OrkInfantryLeaderEntity orkinfantryleaderentity);
    void remove(OrkInfantryLeaderEntity orkinfantryleaderentity);

    List<OrkInfantryLeaderEntity> getAllOrkInfantryLeader();
}


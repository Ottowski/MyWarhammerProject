package org.example.service;

import org.example.repository.orks.*;
import org.example.entity.*;
import java.util.List;

public class OrksRepositoryService {

    private final OrkInfantryRepository infantryRepo;
    private final OrkInfantryLeaderRepository leaderRepo;
    private final OrkMeleeWeaponRepository meleeWeaponRepo;
    private final OrkRangedWeaponRepository rangedWeaponRepo;
    private final OrkSpecialRangedWeaponRepository specialRangedWeaponRepo;

    public OrksRepositoryService(OrkInfantryRepository infantryRepo,
                                 OrkInfantryLeaderRepository leaderRepo,
                                 OrkMeleeWeaponRepository meleeWeaponRepo,
                                 OrkRangedWeaponRepository rangedWeaponRepo,
                                 OrkSpecialRangedWeaponRepository specialRangedWeaponRepo) {
        this.infantryRepo = infantryRepo;
        this.leaderRepo = leaderRepo;
        this.meleeWeaponRepo = meleeWeaponRepo;
        this.rangedWeaponRepo = rangedWeaponRepo;
        this.specialRangedWeaponRepo = specialRangedWeaponRepo;
    }

    public List<OrkInfantryEntity> getAllInfantry() {
        return infantryRepo.getAllOrkInfantry();
    }

    public List<OrkInfantryLeaderEntity> getAllLeaders() {
        return leaderRepo.getAllOrkInfantryLeader();
    }

    public List<OrkMeleeWeaponEntity> getAllMeleeWeapons() {
        return meleeWeaponRepo.getAllOrkMeleeWeapon();
    }

    public List<OrkRangedWeaponEntity> getAllRangedWeapons() {
        return rangedWeaponRepo.getAllOrkRangedWeapon();
    }

    public List<OrkSpecialRangedWeaponEntity> getAllSpecialRangedWeapons() {
        return specialRangedWeaponRepo.getAllOrkSpecialRangedWeapon();
    }
}
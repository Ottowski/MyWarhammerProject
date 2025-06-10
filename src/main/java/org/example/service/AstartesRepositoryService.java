package org.example.service;

import org.example.repository.astartes.*;
import org.example.entity.*;
import java.util.List;

public class AstartesRepositoryService {

    private final AstartesInfantryRepository infantryRepo;
    private final AstartesInfantryLeaderRepository leaderRepo;
    private final AstartesMeleeWeaponRepository meleeWeaponRepo;
    private final AstartesRangedWeaponRepository rangedWeaponRepo;
    private final AstartesSpecialRangedWeaponRepository specialRangedWeaponRepo;

    public AstartesRepositoryService(AstartesInfantryRepository infantryRepo,
                                     AstartesInfantryLeaderRepository leaderRepo,
                                     AstartesMeleeWeaponRepository meleeWeaponRepo,
                                     AstartesRangedWeaponRepository rangedWeaponRepo,
                                     AstartesSpecialRangedWeaponRepository specialRangedWeaponRepo) {
        this.infantryRepo = infantryRepo;
        this.leaderRepo = leaderRepo;
        this.meleeWeaponRepo = meleeWeaponRepo;
        this.rangedWeaponRepo = rangedWeaponRepo;
        this.specialRangedWeaponRepo = specialRangedWeaponRepo;
    }

    public List<AstartesInfantryEntity> getAllInfantry() {
        return infantryRepo.getAllAstartesInfantry();
    }

    public List<AstartesInfantryLeaderEntity> getAllLeaders() {
        return leaderRepo.getAllAstartesInfantryLeader();
    }

    public List<AstartesMeleeWeaponEntity> getAllMeleeWeapons() {
        return meleeWeaponRepo.getAllAstartesMeleeWeapon();
    }

    public List<AstartesRangedWeaponEntity> getAllRangedWeapons() {
        return rangedWeaponRepo.getAllAstartesRangedWeapon();
    }

    public List<AstartesSpecialRangedWeaponEntity> getAllSpecialRangedWeapons() {
        return specialRangedWeaponRepo.getAllAstartesSpecialRangedWeapon();
    }
}

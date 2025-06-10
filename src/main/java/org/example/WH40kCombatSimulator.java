package org.example;

import org.example.coreMechanicConcepts.DAMAGEROLL;
import org.example.coreMechanicConcepts.HITROLL;
import org.example.coreProfileModellStats.SAVE;
import org.example.coreProfileModellStats.TOUGHNESS;
import org.example.coreProfileWeaponStats.ARMORPENETRATION;
import org.example.coreProfileWeaponStats.STRENGTH;
import org.example.entity.*;
import org.example.service.AstartesRepositoryService;
import org.example.service.OrksRepositoryService;
import org.example.repository.astartes.*;
import org.example.repository.orks.*;

import java.util.*;

import static org.example.coreMechanicConcepts.BATTLEMECHANIC.*;

public class WH40kCombatSimulator {

    private final Scanner scanner = new Scanner(System.in);

    // Services for all factions
    private final AstartesRepositoryService astartesService = new AstartesRepositoryService(
            new AstartesInfantryRepository() {
                @Override
                public AstartesInfantryEntity get(int id) {
                    return null;
                }

                @Override
                public void add(AstartesInfantryEntity astartesInfantryEntity) {

                }

                @Override
                public void update(AstartesInfantryEntity astartesInfantryEntity) {

                }

                @Override
                public void remove(AstartesInfantryEntity astartesInfantryEntity) {

                }

                @Override
                public List<AstartesInfantryEntity> getAllAstartesInfantry() {
                    return null;
                }
            },
            new AstartesInfantryLeaderRepository() {
                @Override
                public AstartesInfantryLeaderEntity get(int id) {
                    return null;
                }

                @Override
                public void add(AstartesInfantryLeaderEntity astartesInfantryLeaderEntity) {

                }

                @Override
                public void update(AstartesInfantryLeaderEntity astartesInfantryLeaderEntity) {

                }

                @Override
                public void remove(AstartesInfantryLeaderEntity astartesInfantryLeaderEntity) {

                }

                @Override
                public List<AstartesInfantryLeaderEntity> getAllAstartesInfantryLeader() {
                    return null;
                }
            },
            new AstartesMeleeWeaponRepository() {
                @Override
                public AstartesMeleeWeaponEntity get(int id) {
                    return null;
                }

                @Override
                public void add(AstartesMeleeWeaponEntity astartesMeleeWeaponEntity) {

                }

                @Override
                public void update(AstartesMeleeWeaponEntity astartesMeleeWeaponEntity) {

                }

                @Override
                public void remove(AstartesMeleeWeaponEntity astartesMeleeWeaponEntity) {

                }

                @Override
                public List<AstartesMeleeWeaponEntity> getAllAstartesMeleeWeapon() {
                    return null;
                }
            },
            new AstartesRangedWeaponRepository() {
                @Override
                public AstartesRangedWeaponEntity get(int id) {
                    return null;
                }

                @Override
                public void add(AstartesRangedWeaponEntity astartesRangedWeaponEntity) {

                }

                @Override
                public void update(AstartesRangedWeaponEntity astartesRangedWeaponEntity) {

                }

                @Override
                public void remove(AstartesRangedWeaponEntity astartesRangedWeaponEntity) {

                }

                @Override
                public List<AstartesRangedWeaponEntity> getAllAstartesRangedWeapon() {
                    return null;
                }
            },
            new AstartesSpecialRangedWeaponRepository() {
                @Override
                public AstartesSpecialRangedWeaponEntity get(int id) {
                    return null;
                }

                @Override
                public void add(AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeaponEntity) {

                }

                @Override
                public void update(AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeaponEntity) {

                }

                @Override
                public void remove(AstartesSpecialRangedWeaponEntity astartesSpecialRangedWeaponEntity) {

                }

                @Override
                public List<AstartesSpecialRangedWeaponEntity> getAllAstartesSpecialRangedWeapon() {
                    return null;
                }
            }
    );

    private final OrksRepositoryService orksService = new OrksRepositoryService(
            new OrkInfantryRepository() {
                @Override
                public OrkInfantryEntity get(int id) {
                    return null;
                }

                @Override
                public void add(OrkInfantryEntity orkInfantryEntity) {

                }

                @Override
                public void update(OrkInfantryEntity orkInfantryEntity) {

                }

                @Override
                public void remove(OrkInfantryEntity orkInfantryEntity) {

                }

                @Override
                public List<OrkInfantryEntity> getAllOrkInfantry() {
                    return null;
                }
            },
            new OrkInfantryLeaderRepository() {
                @Override
                public OrkInfantryLeaderEntity get(int id) {
                    return null;
                }

                @Override
                public void add(OrkInfantryLeaderEntity orkInfantryLeaderEntity) {

                }

                @Override
                public void update(OrkInfantryLeaderEntity orkInfantryLeaderEntity) {

                }

                @Override
                public void remove(OrkInfantryLeaderEntity orkInfantryLeaderEntity) {

                }

                @Override
                public List<OrkInfantryLeaderEntity> getAllOrkInfantryLeader() {
                    return null;
                }
            },
            new OrkMeleeWeaponRepository() {
                @Override
                public OrkMeleeWeaponEntity get(int id) {
                    return null;
                }

                @Override
                public void add(OrkMeleeWeaponEntity orkMeleeWeaponEntity) {

                }

                @Override
                public void update(OrkMeleeWeaponEntity orkMeleeWeaponEntity) {

                }

                @Override
                public void remove(OrkMeleeWeaponEntity orkMeleeWeaponEntity) {

                }

                @Override
                public List<OrkMeleeWeaponEntity> getAllOrkMeleeWeapon() {
                    return null;
                }
            },
            new OrkRangedWeaponRepository() {
                @Override
                public OrkRangedWeaponEntity get(int id) {
                    return null;
                }

                @Override
                public void add(OrkRangedWeaponEntity orkRangedWeaponEntity) {

                }

                @Override
                public void update(OrkRangedWeaponEntity orkRangedWeaponEntity) {

                }

                @Override
                public void remove(OrkRangedWeaponEntity orkRangedWeaponEntity) {

                }

                @Override
                public List<OrkRangedWeaponEntity> getAllOrkRangedWeapon() {
                    return null;
                }
            },
            new OrkSpecialRangedWeaponRepository() {
                @Override
                public OrkSpecialRangedWeaponEntity get(int id) {
                    return null;
                }

                @Override
                public void add(OrkSpecialRangedWeaponEntity orkSpecialRangedWeaponEntity) {

                }

                @Override
                public void update(OrkSpecialRangedWeaponEntity orkSpecialRangedWeaponEntity) {

                }

                @Override
                public void remove(OrkSpecialRangedWeaponEntity orkSpecialRangedWeaponEntity) {

                }

                @Override
                public List<OrkSpecialRangedWeaponEntity> getAllOrkSpecialRangedWeapon() {
                    return null;
                }
            }
    );
    public void run() {
        displayWelcomeMessage();
        mainMenu();
    }

    private void displayWelcomeMessage() {
        System.out.println("Welcome to the Warhammer40k Tabletop Combat Simulator!\n-----------------------------");
    }

    private void mainMenu() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Simulate fight between ASTARTES and ORKS");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    runSimulation();
                    break;
                case "2":
                    System.out.println("Exiting simulator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private void runSimulation() {
        System.out.println("Starting simulation: ASTARTES vs ORKS\n");

        // Show units to fight
        System.out.println("--- ASTARTES Infantry ---");
        List<AstartesInfantryEntity> astartesInfantry = astartesService.getAllInfantry();
        for (int i = 0; i < astartesInfantry.size(); i++) {
            System.out.println(i + 1 + ". " + astartesInfantry.get(i));
        }
        System.out.print("Select Astartes unit (number): ");
        int astartesIndex = Integer.parseInt(scanner.nextLine()) - 1;
        AstartesInfantryEntity selectedAstartes = astartesInfantry.get(astartesIndex);

        System.out.println("--- ORKS Infantry ---");
        List<OrkInfantryEntity> orkInfantry = orksService.getAllInfantry();
        for (int i = 0; i < orkInfantry.size(); i++) {
            System.out.println(i + 1 + ". " + orkInfantry.get(i));
        }
        System.out.print("Select Ork unit (number): ");
        int orkIndex = Integer.parseInt(scanner.nextLine()) - 1;
        OrkInfantryEntity selectedOrk = orkInfantry.get(orkIndex);

        // Simulation of fights
        int battles = 1000;
        int astartesWins = 0;
        int orksWins = 0;

        for (int i = 0; i < battles; i++) {
            String winner = simulateFight();
            if ("ASTARTES".equals(winner)) {
                astartesWins++;
            } else if ("ORKS".equals(winner)) {
                orksWins++;
            }
        }

        System.out.println("\nSimulation results after " + battles + " battles:");
        System.out.println("ASTARTES wins: " + astartesWins);
        System.out.println("ORKS wins: " + orksWins);
        double astartesPercent = (double) astartesWins / battles * 100;
        double orksPercent = (double) orksWins / battles * 100;
        System.out.printf("ASTARTES win percentage: %.2f%%\n", astartesPercent);
        System.out.printf("ORKS win percentage: %.2f%%\n", orksPercent);
    }
    public static int runMeleeBattle(Object attackerWeapon, Object defenderUnit) {
        int rangedHits = getAttacksFromRangedWeapons(attackerWeapon);
        int meleeHits = getAttacksFromMeleeWeapons(attackerWeapon);
        int meleeD3D6Hits = getD3OrD6AttacksFromMeleeWeapons(attackerWeapon);
        int rangedD3D6Hits = getD3OrD6AttacksFromRangedWeapons(attackerWeapon);
        int toughness = getToughnessFromEntity(defenderUnit);
        int save = getSaveFromEntity(defenderUnit);
        ARMORPENETRATION ap = extractAPFromWeapon(attackerWeapon);
        Object damage = extractDamageFromWeapon(attackerWeapon);

        int wounds = performWoundRolls(hits, strength, toughness);
        int failedSaves = wounds - performSavingThrows(wounds, save, ap);
        int totalDamage = 0;

        for (int i = 0; i < failedSaves; i++) {
            totalDamage += DAMAGEROLL.calculateDamage(damage);
        }

        return totalDamage;
    }


    private String simulateFight() {
        double random = Math.random();
        return random < 0.5 ? "ASTARTES" : "ORKS";
    }
}
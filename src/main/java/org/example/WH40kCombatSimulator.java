package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class WH40kCombatSimulator {
    public void run() {
        displayWelcomeMessage();
        mainMenu();
    }
    private void displayWelcomeMessage() {
        System.out.println("Welcome to the Warhammer40k Tabletop Combat Simulator!\n-----------------------------");
    }
    private String promptForInput(String message) {
        System.out.print(message);
        Scanner scanner = null;
        return scanner.nextLine();
    }
    private void mainMenu() {
        while (true) {
        }
    }
    private void displayMenuOptions(List<String> options) {
        options.forEach(System.out::println);
    }
}
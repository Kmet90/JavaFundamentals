package ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myHealth = 100;
        int bitcoins = 0;
        String[] dungeonsRooms = scanner.nextLine().split("\\|+");

        for (int i = 0; i < dungeonsRooms.length; i++) {
            String room = dungeonsRooms[i];
            String[] tokens = room.split("\\s+");
            String command = tokens[0];
            int points = Integer.parseInt(tokens[1]);

            switch (command) {
                case "potion":
                    int currentHealth = myHealth;
                    myHealth += points;
                    if (myHealth > 100) {
                        myHealth = 100;
                        int healed = 100 - currentHealth;
                        System.out.printf("You healed for %d hp.%n", healed);
                    } else {
                        System.out.printf("You healed for %d hp.%n", points);
                    }
                    System.out.printf("Current health: %d hp.%n", myHealth);
                    break;
                case "chest":
                    bitcoins += points;
                    System.out.printf("You found %d bitcoins.%n", points);
                    break;
                default: {
                    myHealth -= points;
                    if (myHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", myHealth);
    }
}

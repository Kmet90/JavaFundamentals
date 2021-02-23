package ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String distance = scanner.nextLine();
        int battleWon = 0;

        while (!distance.equals("End of battle")) {
            int strike = Integer.parseInt(distance);
            if (energy >= strike) {
                energy -= strike;
                battleWon++;
                if (battleWon % 3 == 0) {
                    energy += battleWon;
                }
            } else {
                System.out.printf("Not enough energy! Game ends" +
                        " with %d won battles and %d energy", battleWon, energy);
                return;
            }

            distance = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", battleWon, energy);
    }
}

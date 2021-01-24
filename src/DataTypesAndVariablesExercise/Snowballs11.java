package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double highestVolume = Double.MIN_VALUE;
        int snow = 0;
        int time = 0;
        int quantity = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double volume = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (highestVolume < volume) {
                highestVolume = volume;
                snow = snowballSnow;
                time = snowballTime;
                quantity = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snow, time, highestVolume, quantity);
    }
}

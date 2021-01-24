package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLiters = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;

        for (int i = 0; i < nLiters; i++) {
            int quantityOfWater = Integer.parseInt(scanner.nextLine());
            tankCapacity -= quantityOfWater;
            if (tankCapacity < 0) {
                System.out.println("Insufficient capacity!");
                tankCapacity += quantityOfWater;
            }
        }
        System.out.println(255 - tankCapacity);
    }
}


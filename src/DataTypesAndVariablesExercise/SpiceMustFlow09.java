package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int spices = 0;
        int days = 0;
        int foodForWorkersPerDay = 26;

        while (yield >= 100) {
            spices += yield;
            days++;
            yield -= 10;
        }
        int totalSpaces = spices - days * foodForWorkersPerDay;

        if (totalSpaces>26){
            totalSpaces-=26;
        }
        System.out.println(days);
        System.out.println(totalSpaces);

    }
}

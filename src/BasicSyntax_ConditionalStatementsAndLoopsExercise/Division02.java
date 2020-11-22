package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxDivision = 0;

        if (n % 2 == 0) {
            maxDivision = 2;
        }
        if (n % 3 == 0) {
            maxDivision = 3;
        }
        if (n % 6 == 0) {
            maxDivision = 6;
        }
        if (n % 7 == 0) {
            maxDivision = 7;
        }
        if (n % 10 == 0) {
            maxDivision = 10;
        }
        if (maxDivision > 0) {
            System.out.printf("The number is divisible by %d", maxDivision);
        } else {
            System.out.println("Not divisible");
        }

    }
}

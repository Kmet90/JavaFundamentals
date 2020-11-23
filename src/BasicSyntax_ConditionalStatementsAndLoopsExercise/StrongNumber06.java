package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String fNumber = Integer.toString(number);
        int totalSum = 0;

        for (int i = 0; i < fNumber.length(); i++) {
            int sum = 1;
            char digit = fNumber.charAt(i);
            int newDigit = Character.getNumericValue(digit);

            for (int j = 1; j <= newDigit; j++) {
                sum *= j;
            }
            totalSum += sum;
        }
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

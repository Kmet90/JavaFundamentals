package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (Character.isDigit(digit)) {
                sum += digit - 48;
            }
        }
        System.out.println(sum);
    }
}

package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printTrueOrfFalse(scanner, input);
    }

    private static void printTrueOrfFalse(Scanner scanner, String input) {
        while (!input.equals("END")) {
            String reversed = getReversed(input);

            int inputNumber = Integer.parseInt(input);
            int reverseNumber = Integer.parseInt(reversed);

            checkTrueOrFalse(inputNumber, reverseNumber);

            input = scanner.nextLine();
        }
    }

    private static void checkTrueOrFalse(int inputNumber, int reverseNumber) {
        if (inputNumber == reverseNumber) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static String getReversed(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            reversed.append(ch);
        }
        return reversed.toString();
    }
}

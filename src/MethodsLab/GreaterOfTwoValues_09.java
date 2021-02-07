package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int number1 = Integer.parseInt(scanner.nextLine());
                int number2 = Integer.parseInt(scanner.nextLine());
                int greaterNumber = getMax(number1, number2);
                System.out.println(greaterNumber);
                break;
            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                char greaterChar = getMax(char1, char2);
                System.out.println(greaterChar);
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                String greaterString = getMax(first, second);
                System.out.println(greaterString);
                break;
        }
    }

    static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }

    static char getMax(char number1, char number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}


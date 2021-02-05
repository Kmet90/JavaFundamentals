package MethodsLab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (calculation) {
            case "add":
                addNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber, secondNumber);
                break;
        }
    }

    private static void divideNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void subtractNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void multiplyNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void addNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}

package MethodsLab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = calculationResult(firstNumber, operator, secondNumber);
        System.out.printf("%.0f", result);
    }

    private static double calculationResult(double firstNumber, char operator, double secondNumber) {
        double result = 0.0;
        switch (operator) {
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}

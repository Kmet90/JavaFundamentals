package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int subtract = subtractFromSum(number3,number2,number1);
        System.out.println(subtract);
    }

    private static int subtractFromSum(int number3 ,int  number1,int number2 ) {
        int sum = sumOfTwoNumbers(number1, number2);
        return sum - number3;
    }

    private static int sumOfTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}

package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fortNumber = Integer.parseInt(scanner.nextLine());

        int sum = (int)((firstNumber+secondNumber)/thirdNumber)*fortNumber;

        System.out.println(sum);
    }
}

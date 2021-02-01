package DataTypesAndVariables_MoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal number1 = new BigDecimal(scanner.nextLine());
        BigDecimal number2 = new BigDecimal(scanner.nextLine());

        if (Math.abs(number1.compareTo(number2)) <= 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(Math.abs(number1.compareTo(number2)));
    }
}

package BasicSyntax_ConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2_0_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());

        if (!(secondDigit > 10)) {
            for (int i = secondDigit; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", firstDigit, i, firstDigit * i);
            }
        } else {
            System.out.printf("%d X %d = %d", firstDigit, secondDigit, firstDigit * secondDigit);
        }
    }
}

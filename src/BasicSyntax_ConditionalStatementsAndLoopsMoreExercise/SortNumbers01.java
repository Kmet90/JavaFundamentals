package BasicSyntax_ConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class SortNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        if (firstDigit >= secondDigit && secondDigit >= thirdDigit) {
            System.out.println(firstDigit);
            System.out.println(secondDigit);
            System.out.println(thirdDigit);
        } else if (firstDigit >= thirdDigit && thirdDigit >= secondDigit) {
            System.out.println(firstDigit);
            System.out.println(thirdDigit);
            System.out.println(secondDigit);
        } else if (secondDigit >= firstDigit && firstDigit >= thirdDigit) {
            System.out.println(secondDigit);
            System.out.println(firstDigit);
            System.out.println(thirdDigit);
        } else if (secondDigit >= firstDigit && thirdDigit >= firstDigit) {
            System.out.println(secondDigit);
            System.out.println(thirdDigit);
            System.out.println(firstDigit);
        } else if (thirdDigit >= firstDigit && firstDigit >= secondDigit) {
            System.out.println(thirdDigit);
            System.out.println(firstDigit);
            System.out.println(secondDigit);
        } else if (thirdDigit >= firstDigit && secondDigit>=firstDigit){
            System.out.println(thirdDigit);
            System.out.println(secondDigit);
            System.out.println(firstDigit);
        }
    }
}

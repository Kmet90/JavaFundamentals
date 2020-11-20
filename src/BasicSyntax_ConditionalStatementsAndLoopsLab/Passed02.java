package BasicSyntax_ConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class Passed02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = Double.parseDouble(scanner.nextLine());

        if (score >= 3) {
            System.out.println("Passed!");
        }
    }
}

package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Ages01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String person = "";

        if (age >= 66) {
            person = "elder";
        } else if (age >= 20) {
            person = "adult";
        } else if (age >= 14) {
            person = "teenager";
        } else if (age >= 3) {
            person = "child";
        } else if (age >= 0) {
            person = "baby";
        }
        System.out.println(person);
    }
}

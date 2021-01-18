package BasicSyntax_ConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inString = scanner.nextLine();

        StringBuilder reverseString = new StringBuilder();

        for (int i = inString.length() - 1; i >= 0; i--) {
            char ch = inString.charAt(i);
            reverseString.append(ch);
        }
        System.out.println(reverseString);
    }
}
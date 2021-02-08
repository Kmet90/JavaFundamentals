package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);

        printCharacterInRange(ch1, ch2);
    }

    private static void printCharacterInRange(char ch1, char ch2) {
        if (ch1 < ch2) {
            for (int i = ch1 + 1; i < ch2; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ch2 + 1; i < ch1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}

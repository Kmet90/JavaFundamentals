package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 0){
            char ch1 = input.charAt(input.length()/2-1);
            char ch2 = input.charAt(input.length()/2);
            System.out.printf("%c%c", ch1,ch2);
        }else {
            char ch = input.charAt(input.length()/2);
            System.out.println(ch);
        }
    }
}

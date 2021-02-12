package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean ch = checkCharacterLength(password);
        boolean letterAndDigit = checkForLetterAndDigit(password);
        boolean digits = checkForTwoDigits(password);

        if (ch && letterAndDigit && digits) {
            System.out.println("Password is valid");
        } else {
            if (!ch) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!letterAndDigit){
                System.out.println("Password must consist only of letters and digits");
            }
            if(!digits){
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    private static boolean checkForTwoDigits(String password) {
            int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                count++;
            }
        }
        return count >= 2;
    }

    private static boolean checkForLetterAndDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (!Character.isLetterOrDigit(character)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCharacterLength(String password) {
        return (password.length() >= 6 && password.length() <= 10);
    }
}

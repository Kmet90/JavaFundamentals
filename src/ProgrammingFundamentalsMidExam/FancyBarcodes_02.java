package ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();

            String newPassword = password.replace("@", "");
            String password1 = newPassword;
            newPassword = password1.replace("#", "");

            boolean surround = checkSurround(password);
            boolean letterAndDigit = checkForLetterAndDigit(newPassword);
            boolean ch = checkCharacterLength(newPassword);
            String group = digitsNumber(newPassword);

            if (surround && letterAndDigit && ch) {
                if (group.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", group);
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }

    private static String digitsNumber(String newPassword) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isDigit(newPassword.charAt(i))) {
                number.append(newPassword.charAt(i));
            }
        }
        return number.toString();
    }


    private static boolean checkCharacterLength(String password) {
        return password.length() >= 6;
    }

    private static boolean checkForLetterAndDigit(String password) {
            char firstChar = password.charAt(0);
            char lastChar = password.charAt(password.length()-1);
            if (!Character.isUpperCase(firstChar)){
                return false;
            }
            if (!Character.isUpperCase(lastChar)){
                return false;
            }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSurround(String password) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '@') {
                count1++;
            }
            if (password.charAt(i) == '#') {
                count2++;
            }
            if (count1 == 2 && count2 >= 2) {
                return true;
            }
        }
        return false;
    }
}

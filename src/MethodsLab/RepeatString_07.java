package MethodsLab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String newString = repeatedString(input, n);
        System.out.println(newString);
    }

    private static String repeatedString(String input, int n) {
        StringBuilder repeatStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeatStr.append(input);
        }
        return repeatStr.toString();
    }
}

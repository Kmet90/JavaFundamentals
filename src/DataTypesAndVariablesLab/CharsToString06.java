package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);
        String all = ch1 + Character.toString(ch2) + ch3;

        System.out.println(all);
    }
}

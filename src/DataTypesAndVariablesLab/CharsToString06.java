package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ch1 = scanner.nextLine();
        String ch2 = scanner.nextLine();
        String ch3 = scanner.nextLine();

        String all = ch1+ch2+ch3;

        System.out.println(all);
    }
}

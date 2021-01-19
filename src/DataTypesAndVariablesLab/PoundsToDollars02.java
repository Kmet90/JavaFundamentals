package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 British Pound = 1.31 Dollars
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.31;

        System.out.printf("%.3f", dollars);
    }
}

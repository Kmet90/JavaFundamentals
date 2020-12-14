package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int finalNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= finalNumber; i++) {
            System.out.printf("%c ", (char) i);
        }
    }
}

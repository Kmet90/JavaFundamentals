package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (int i = 0; i <= array2.length - 1; i++) {
            String word = array2[i];
            for (int j = 0; j <= array1.length - 1; j++) {
                if (word.equals(array1[j])) {
                    System.out.print(array2[i] + " ");
                }
            }
        }

    }
}

package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            if (i % 2 == 1) {
                array1[i - 1] = numbers[0];
                array2[i - 1] = numbers[1];
            } else {
                array1[i - 1] = numbers[1];
                array2[i - 1] = numbers[0];
            }
        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));

    }
}


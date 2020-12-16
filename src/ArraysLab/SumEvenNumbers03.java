package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
         System.out.println(sum);
    }
}

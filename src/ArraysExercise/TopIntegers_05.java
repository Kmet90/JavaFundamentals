package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean flag = false;

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }

            for (int j = i + 1; j <= numbers.length - 1; j++) {

                if (numbers[i] > numbers[j]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

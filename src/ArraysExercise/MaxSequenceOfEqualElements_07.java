package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        int number = 0;
        int count = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
                if (count > counter) {
                    counter = count;
                    number = numbers[i];
                }
            } else {
                count = 1;
            }

        }
        for (int j = 0; j < counter; j++) {
            System.out.print(number + " ");
        }
    }
}
package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int equalSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int sum;
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (equalSum == sum) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}

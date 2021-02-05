package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
       // boolean flag = false;

        for (int i = 0; i <= numbers.length - 1; i++) {
        int leftSum = 0;
        int rightSum = 0;
            for (int j = 0; j <= i - 1; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
              //  flag=true;
            }
        }
        //if (!flag) {
            System.out.println("no");
       // }
    }
}

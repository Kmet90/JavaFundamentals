package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] arr2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

            int sumArr = 0;
            boolean flag = true;
        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                sumArr += arr1[i];
                if (arr1[i] != arr2[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.printf("Arrays are identical. Sum: %d",sumArr);
        }

    }
}

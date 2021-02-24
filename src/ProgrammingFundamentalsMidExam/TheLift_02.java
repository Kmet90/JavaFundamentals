package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int k : lift) {
            sum += k;
        }
        if (sum == 4 * lift.length) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int i2 : lift) {
                System.out.print(i2 + " ");
            }
            return;
        }
        for (int i = 0; i < lift.length; i++) {
            int value = lift[i];
            for (int j = value; j < 4; j++) {
                if (people == 0) {
                    System.out.printf("The lift has empty spots!%n");
                    for (int i1 : lift) {
                        System.out.print(i1 + " ");
                    }
                    return;
                }
                people--;
                lift[i]++;
            }
        }
        System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        for (int i2 : lift) {
            System.out.print(i2 + " ");
        }
    }
}

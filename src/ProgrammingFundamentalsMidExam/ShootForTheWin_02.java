package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int target = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index <= numbers.length - 1) {
                target++;
                int value = numbers[index];
                numbers[index] = -1;
                for (int i = 0; i < numbers.length; i++) {
                    if (!(numbers[i] == -1)) {
                        if (numbers[i] > value) {
                            numbers[i] -= value;
                        } else if (numbers[i] <= value) {
                            numbers[i] += value;
                        }
                    }
                }
            }
            input = scanner.nextLine();

        }
        System.out.printf("Shot targets: %d -> ",target);
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]",""));
    }
}

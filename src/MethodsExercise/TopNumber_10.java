package MethodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printTopNUmber(n);
    }

    private static void printTopNUmber(int n) {
        for (int i = 1; i <= n; i++) {
            boolean odd = findLessThenOneOdd(i);
            boolean divide = divideSumBy8(i);
            if (divide && odd) {
                System.out.println(i);
            }
        }
    }

    private static boolean findLessThenOneOdd(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                count++;
            }
            number /= 10;
        }
        return count >= 2;
    }

    private static boolean divideSumBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int digits = number % 10;
            sum += digits;
            number /= 10;
        }
        return sum % 8 == 0;
    }
}

package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = getMultipleOfEvensAndOdds(Math.abs(number));
        System.out.println(sum);
    }

    static int getMultipleOfEvensAndOdds(int n) {
        int oddSum = getSumOfOddDigits(n);
        int evenSum = getSumOfEvenDigits(n);
        return evenSum * oddSum;
    }

    static int getSumOfOddDigits(int n) {
        int oddSum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            n /= 10;
        }
        return oddSum;
    }

    static int getSumOfEvenDigits(int n) {
        int evenSum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            n /= 10;
        }
        return evenSum;
    }
}

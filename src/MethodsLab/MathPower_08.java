package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double power = Integer.parseInt(scanner.nextLine());

        double number = mathPowerNumber(n, power);
        System.out.println(new DecimalFormat("0.####").format(number));
    }

    private static double mathPowerNumber(double n, double power) {
        return Math.pow(n , power);
    }
}

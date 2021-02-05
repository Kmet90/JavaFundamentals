package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(wight, height);
        System.out.printf("%.0f", area);
    }

    private static double calculateRectangleArea(double wight, double height) {
        return wight * height;
    }
}

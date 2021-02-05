package MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                finalPrice(quantity, 1.5);
                break;
            case "water":
                finalPrice(quantity, 1.00);
                break;
            case "coke":
                finalPrice(quantity, 1.40);
                break;
            case "snacks":
                finalPrice(quantity, 2.00);
                break;
        }
    }

    private static void finalPrice(int quantity, double v) {
        double price;
        price = v;
        System.out.printf("%.2f", quantity * price);
    }
}

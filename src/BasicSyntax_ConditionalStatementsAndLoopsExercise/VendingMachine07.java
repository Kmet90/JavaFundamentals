package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coin = scanner.nextLine();
        double sumCoins = 0;
        while (!coin.equals("Start")) {
            double parseCoin = Double.parseDouble(coin);
            if (parseCoin == 0.1 || parseCoin == 0.2 || parseCoin == 0.5 || parseCoin == 1 || parseCoin == 2) {
                sumCoins += parseCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", parseCoin);
            }
            coin = scanner.nextLine();
        }
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":

                    if (sumCoins >= 2) {
                        System.out.printf("Purchased %s%n", product);
                        sumCoins -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= 1.5) {
                        System.out.printf("Purchased %s%n", product);
                        sumCoins -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":

                    if (sumCoins >= 0.7) {
                        System.out.printf("Purchased %s%n", product);
                        sumCoins -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumCoins >= 0.8) {
                        System.out.printf("Purchased %s%n", product);
                        sumCoins -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumCoins >= 1) {
                        System.out.printf("Purchased %s%n", product);
                        sumCoins -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}

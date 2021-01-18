package BasicSyntax_ConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double spendMoney = 0;
        boolean flag = false;

        while (!game.equals("Game Time")) {

            double gamePrice = 0;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    flag = true;
                    break;
            }
            if (flag) {
                game = scanner.nextLine();
                flag = false;
            } else if (gamePrice > money) {
                System.out.println("Too Expensive");
                game = scanner.nextLine();
            } else {
                System.out.println("Bought " + game);
                money -= gamePrice;
                spendMoney += gamePrice;
                game = scanner.nextLine();
            }
            if (money == 0) {
                System.out.println("Out of money!");
                return;
            }
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, money);
    }
}

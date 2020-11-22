package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (dayOfTheWeek) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                if (groupOfPeople >= 30) {
                    price = price * 0.85;
                }
                break;
            case "Business":
                switch (dayOfTheWeek) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16.00;
                        break;
                }
                if (groupOfPeople >= 100) {
                    groupOfPeople -= 10;
                }
                break;
            case "Regular":
                switch (dayOfTheWeek) {
                    case "Friday":
                        price = 15.00;
                        break;
                    case "Saturday":
                        price = 20.00;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                if (10 <= groupOfPeople && groupOfPeople <= 20) {
                    price = price * 0.95;
                }
                break;
        }
        double totalPrice = groupOfPeople * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

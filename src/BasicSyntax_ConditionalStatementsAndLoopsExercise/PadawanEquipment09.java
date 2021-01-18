package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOneSabre = Double.parseDouble(scanner.nextLine());
        double priceOneRobe = Double.parseDouble(scanner.nextLine());
        double priceOneBelt = Double.parseDouble(scanner.nextLine());

        double priceForSabre = Math.ceil(students + students * 0.1) * priceOneSabre;
        double priceForRobe = students * priceOneRobe;
        double priceForBelt = (students - Math.floor(students*1.0 / 6)) * priceOneBelt;

        double totalPrice = priceForSabre + priceForRobe + priceForBelt;

        if (amountOfMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalPrice-amountOfMoney);
        }
    }
}

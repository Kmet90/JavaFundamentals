package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int indexCupid = 0;
        int countDays = 0;

        while (!command.equals("Love!")) {
            String[] jump = command.split(" ");
            int newIndex = Integer.parseInt(jump[1]);
            indexCupid += newIndex;
            if (indexCupid > houses.length - 1) {
                indexCupid = 0;
            }
            int num = houses[indexCupid] - 2;
            houses[indexCupid] = num;
            if (num == 0) {
                System.out.printf("Place %d has Valentine's day.%n", indexCupid);
                countDays++;
            }
            if (houses[indexCupid] < 0) {
                System.out.printf("Place %d already had Valentine's day.%n", indexCupid);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", indexCupid);
        if (houses.length - countDays == 0) {
            System.out.print("Mission was successful.");
        } else System.out.printf("Cupid has failed %d places.", houses.length - countDays);
    }
}

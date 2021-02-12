package ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class NationalCourt_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        int peoplePerHour = employee1 + employee2 + employee3;

        while (people > 0) {
            people -= peoplePerHour;
            hours++;
            if (hours % 4 == 0) {
                hours++;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}

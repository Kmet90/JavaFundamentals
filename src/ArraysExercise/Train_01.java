package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[wagons];
        int allPeopleInTrain = 0;

        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            allPeopleInTrain += people[i];
        }
        for (int person : people) {
            System.out.print(person +" ");
        }
        System.out.println();
        System.out.println(allPeopleInTrain);
    }
}

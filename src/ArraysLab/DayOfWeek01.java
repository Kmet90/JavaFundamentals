package ArraysLab;

import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        if (1<= day && day <=7){
            System.out.println(days[day - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}

package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("end")) {
            count++;
            String[] token = command.split("\\s+");
            int index1 = Integer.parseInt(token[0]);
            int index2 = Integer.parseInt(token[1]);
            if (index1 == index2 || index1 < 0 || index2 < 0 || index1 >= input.size() || index2 >= input.size()) {
                System.out.printf("Invalid input! Adding additional elements to the board%n");
                int middle = input.size() / 2;
                String insertElement = "-"+count+"a";
                input.add(middle, insertElement);
                input.add(middle, insertElement);
            } else {
                String element1 = input.get(index1);
                String element2 = input.get(index2);
                if (element1.equals(element2)) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                    input.remove(element1);
                    input.remove(element2);
                    if (input.isEmpty()) {
                        System.out.printf("You have won in %d turns!", count);
                        return;
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            command = scanner.nextLine();
        }

            System.out.printf("Sorry you lose :(%n");
            System.out.println(input.toString().replaceAll("[\\[\\],]", ""));

    }
}

package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] token = command.split("\\s+");
            int filterNumber;
            switch (token[0]) {
                case "Contains":
                    int number = Integer.parseInt(token[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (token[1]) {
                        case "even":
                            for (Integer n : numbers) {
                                if (n % 2 == 0) {
                                    System.out.print(n + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (Integer n : numbers) {
                                if (n % 2 == 1) {
                                    System.out.print(n + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer n : numbers) {
                        sum += n;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (token[1]) {
                        case ">":
                        filterNumber = Integer.parseInt(token[2]);
                            for (Integer integer : numbers) {
                                if (filterNumber < integer) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<":
                            filterNumber = Integer.parseInt(token[2]);
                            for (Integer integer : numbers) {
                                if (filterNumber > integer) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            filterNumber = Integer.parseInt(token[2]);
                            for (Integer integer : numbers) {
                                if (filterNumber <= integer) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            filterNumber = Integer.parseInt(token[2]);
                            for (Integer integer : numbers) {
                                if (filterNumber >= integer) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

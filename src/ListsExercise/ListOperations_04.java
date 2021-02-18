package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] token = command.split("\\s+");
            switch (token[0]) {
                case "Add":
                    numbers.add(token[1]);
                    break;
                case "Insert":
                    int index = Integer.parseInt(token[2]);
                    if (index < 0 || index > numbers.size()) {
                        System.out.println("Invalid index");
                    } else numbers.add(index, token[1]);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(token[1]);
                    if (removeIndex < 0 || removeIndex > numbers.size()) {
                        System.out.println("Invalid index");
                    } else numbers.remove(removeIndex);
                    break;
                case "Shift":
                    String direction = token[1];
                    int count = Integer.parseInt(token[2]);
                    switch (direction) {
                        case "left":
                            for (int i = 0; i < count; i++) {
                                numbers.add(numbers.get(0));
                                numbers.remove(0);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                numbers.add(0, numbers.get(numbers.size() - 1));
                                numbers.remove(numbers.size() - 1);
                            }
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }


}



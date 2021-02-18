package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Delete":
                    numbers.removeIf(number -> number.equals(tokens[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(tokens[2]), tokens[1]);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}

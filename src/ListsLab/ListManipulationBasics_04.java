package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] token = command.split("\\s+");
            int number = Integer.parseInt(token[1]);
            switch (token[0]) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numbers.remove(number);
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(token[2]), number);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}

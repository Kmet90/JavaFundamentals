package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);

            switch (action) {
                case "Shoot":
                    if (index >= 0 && index <= targets.size() - 1) {
                        targets.set(index, targets.get(index) - value);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;

                case "Add":
                    if (index >= 0 && index <= targets.size() - 1) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case "Strike":

                    int startIndex = index - value;
                    int endIndex = index + value;
                    if (startIndex < 0 || endIndex > targets.size() - 1) {
                        System.out.println("Strike missed!");
                    } else {
                        for (int i = startIndex; i <= endIndex; i++) {
                            targets.remove(i);
                            i--;
                            endIndex--;
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.print(targets.get(i) + "|");
        }
        System.out.println(targets.get(targets.size() - 1));

    }
}

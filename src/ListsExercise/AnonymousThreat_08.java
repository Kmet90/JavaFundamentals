package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];

            switch (action) {
                case "merge":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > data.size() - 1) {
                        endIndex = data.size() - 1;
                    }
                    for (int i = startIndex; i < endIndex; i++) {
                        String mergeString = data.get(i) + data.get(i + 1);
                        data.set(i, mergeString);
                        data.remove(i + 1);
                        i--;
                        endIndex--;
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);
                    String divideString = data.get(index);
                    data.remove(index);
                    int countIndex = 0;
                    if (divideString.length() % partitions == 0) {
                        for (int i = 0; i < partitions; i++) {
                            StringBuilder newString = new StringBuilder();
                            for (int j = 0; j < divideString.length() / partitions; j++) {
                                char ch = divideString.charAt(countIndex);
                                newString.append(ch);
                                countIndex++;
                            }
                            data.add(index, newString.toString());
                            index++;
                        }
                    } else {
                        for (int i = 0; i < partitions - 1; i++) {
                            StringBuilder newString = new StringBuilder();
                            for (int j = 0; j < divideString.length() / partitions; j++) {
                                char ch = divideString.charAt(countIndex);
                                newString.append(ch);
                                countIndex++;
                            }
                            data.add(index, newString.toString());
                            index++;
                        }
                        StringBuilder endString = new StringBuilder();
                        for (int i = countIndex; i < divideString.length(); i++) {
                            char ch = divideString.charAt(i);
                            endString.append(ch);
                        }
                        data.add(index, endString.toString());
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(data.toString().replaceAll("[\\[\\],]", ""));
    }
}

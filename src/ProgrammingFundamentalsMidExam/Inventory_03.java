package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] tokens = command.split(" - ");
            String action = tokens[0];
            String item = tokens[1];
            switch (action) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    items.remove(item);
                    break;
                case "Combine Items":
                    String[] changeItem = item.split(":");
                    String oldItem = changeItem[0];
                    String newItem = changeItem[1];
                    if (items.contains(oldItem)) {
                        int index = items.indexOf(oldItem);
                        items.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
      /*  for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.println(items.get(items.size() - 1));*/

        System.out.println(items.toString().replaceAll("[\\[\\]]", ""));
    }
}

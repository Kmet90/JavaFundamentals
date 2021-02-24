package ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];
            switch (action) {
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    int keepValue = input[index1];
                    input[index1] = input[index2];
                    input[index2] = keepValue;
                    break;
                case "multiply":
                    input[Integer.parseInt(tokens[1])] = input[Integer.parseInt(tokens[1])] * input[Integer.parseInt(tokens[2])];
                    break;
                case "decrease":
                    for (int i = 0; i < input.length; i++) {
                        input[i] = input[i] - 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(input).replaceAll("[\\[\\]]", ""));


    }
}

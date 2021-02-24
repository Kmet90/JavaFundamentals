package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        int number;

        while (!input.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                number = input.get(0);
                input.set(0, input.get(input.size() - 1));
                sum += number;
            } else if (index >= input.size()) {
                number = input.get(input.size() - 1);
                input.set(input.size() - 1, input.get(0));
                sum += number;
            } else {
                number = input.get(index);
                input.remove(index);
                sum += number;
            }

            for (int i = 0; i < input.size(); i++) {
                if (input.get(i) <= number) {
                    input.set(i, input.get(i) + number);
                } else {
                    input.set(i, input.get(i) - number);
                }
            }
        }
        System.out.println(sum);
    }
}

package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] bombNumber = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int bomb = bombNumber[0];
        int bombPower = bombNumber[1];

        for (int i = 0; i < numbers.size(); i++) {
            if (bomb == numbers.get(i)) {
                for (int j = bombPower; j > 0; j--) {
                    if (i - 1 >= 0) {
                        numbers.remove(i - 1);
                        i--;
                    }
                }
                for (int k = 0; k < bombPower; k++) {
                    if ((i + 1) < numbers.size()) {
                        numbers.remove(i + 1);
                    }
                }
                numbers.remove(i);
                i--;
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

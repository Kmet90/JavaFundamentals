package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!player1.isEmpty() && !player2.isEmpty()) {
            if (player1.get(0).equals(player2.get(0))) {
                player1.remove(0);
                player2.remove(0);
            } else if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            } else if (player2.get(0) > player1.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player2.remove(0);
                player1.remove(0);
            }
        }
        int sum = 0;

        if (player1.size() > player2.size()) {
            for (Integer integer : player1) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        } else {
            for (Integer integer : player2) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
    }
}

package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());
        String passenger = scanner.nextLine();

        while (!passenger.equals("end")) {
            String[] token = passenger.split("\\s+");
            if (token.length > 1) {
                wagons.add(Integer.parseInt(token[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    int totalPassenger = wagons.get(i) + Integer.parseInt(token[0]);
                    if ( totalPassenger<= maxWagonCapacity) {
                        wagons.set(i, totalPassenger);
                        break;
                    }
                }
            }

            passenger = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));
    }
}

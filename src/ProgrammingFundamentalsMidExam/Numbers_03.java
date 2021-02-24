package ProgrammingFundamentalsMidExam;

import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        double averageNumber;

        for (int j : input) {
            sum += j;
        }
        averageNumber = 1.0 * sum / input.length;
        List<Integer> topNumbers = new ArrayList<>();

        for (int j : input) {
            if (j > averageNumber) {
                topNumbers.add(j);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);
        if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            if (topNumbers.size() > 5) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(topNumbers.get(i) + " ");
                }
            }else{
                System.out.println(topNumbers.toString().replaceAll("[\\[\\],]", ""));
            }
        }
    }
}

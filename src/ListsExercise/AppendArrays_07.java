package ListsExercise;

import java.util.Scanner;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\|");
        StringBuilder sequence = new StringBuilder();

        for (int i = array.length-1; i >= 0; i--) {
            String[] currentArray = array[i].split("\\s+");
            for (String s : currentArray) {
                if (!s.equals("")){
                    sequence.append(s).append(" ");
                }
            }
        }
        System.out.println(sequence);
    }
}

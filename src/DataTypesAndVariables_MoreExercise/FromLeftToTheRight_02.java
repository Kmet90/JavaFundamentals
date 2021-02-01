package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfLines = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        boolean flag = true;
        for (int i = 0; i < numbersOfLines; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char number = input.charAt(j);
                if (flag) {
                    if (!Character.isDigit(number)) {
                        flag = false;
                    } else {
                        leftSum += Character.getNumericValue(number);
                    }
                } else if (Character.isDigit(number)) {
                    rightSum += Character.getNumericValue(number);
                }
            }
                //System.out.println(Math.max(leftSum, rightSum));

            leftSum = 0;
            rightSum = 0;
            flag = true;
        }
    }
}

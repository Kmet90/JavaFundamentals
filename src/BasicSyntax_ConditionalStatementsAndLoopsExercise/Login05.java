package BasicSyntax_ConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        int counter = 0;

        while (true) {
            String password = scanner.nextLine();
            String newPassword = "";
            for (int i = password.length() - 1; i >= 0; i--) {
                newPassword += password.charAt(i);
            }
            if (user.equals(newPassword)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                if (counter == 3) {
                    System.out.printf("User %s blocked!", user);
                    break;
                }
                counter++;
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}

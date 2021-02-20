package ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            switch (command.split(" ")[0]) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        char ch = password.charAt(i);
                        if (i % 2 == 1) {
                            newPassword.append(ch);
                        }
                    }
                    password = newPassword.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    StringBuilder cutPassword = new StringBuilder();
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int length = Integer.parseInt(command.split(" ")[2]);
                    for (int i = 0; i < index; i++) {
                        cutPassword.append(password.charAt(i));
                    }
                    for (int i = index + length; i < password.length(); i++) {
                        cutPassword.append(password.charAt(i));
                    }
                    password = cutPassword.toString();
                    System.out.println(password);
                    break;
                case "Substitute":
                    String replacePassword = password.replace(command.split(" ")[1], command.split(" ")[2]);
                    if (replacePassword.equals(password)) {
                        System.out.println("Nothing to replace!");
                    } else {
                        password = replacePassword;
                        System.out.println(password);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}

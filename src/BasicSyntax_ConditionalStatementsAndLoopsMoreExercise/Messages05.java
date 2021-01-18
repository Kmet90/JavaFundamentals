package BasicSyntax_ConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smsSize = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < smsSize; i++) {
            String pressedNumber = scanner.nextLine();
            int size = pressedNumber.length();
            int number = Integer.parseInt(pressedNumber);
            String ch = "";
            switch (number % 10) {
                case 2:
                    switch (size) {
                        case 1:
                            ch = "a";
                            break;
                        case 2:
                            ch = "b";
                            break;
                        case 3:
                            ch = "c";
                            break;
                    }
                    break;
                case 3:
                    switch (size) {
                        case 1:
                            ch = "d";
                            break;
                        case 2:
                            ch = "e";
                            break;
                        case 3:
                            ch = "f";
                            break;
                    }
                    break;
                case 4:
                    switch (size) {
                        case 1:
                            ch = "g";
                            break;
                        case 2:
                            ch = "h";
                            break;
                        case 3:
                            ch = "i";
                            break;
                    }
                    break;
                case 5:
                    switch (size) {
                        case 1:
                            ch = "j";
                            break;
                        case 2:
                            ch = "k";
                            break;
                        case 3:
                            ch = "l";
                            break;
                    }
                    break;
                case 6:
                    switch (size) {
                        case 1:
                            ch = "m";
                            break;
                        case 2:
                            ch = "n";
                            break;
                        case 3:
                            ch = "o";
                            break;
                    }
                    break;
                case 7:
                    switch (size) {
                        case 1:
                            ch = "p";
                            break;
                        case 2:
                            ch = "q";
                            break;
                        case 3:
                            ch = "r";
                            break;
                        case 4:
                            ch = "s";
                            break;
                    }
                    break;
                case 8:
                    switch (size) {
                        case 1:
                            ch = "t";
                            break;
                        case 2:
                            ch = "u";
                            break;
                        case 3:
                            ch = "v";
                            break;
                    }
                    break;
                case 9:
                    switch (size) {
                        case 1:
                            ch = "w";
                            break;
                        case 2:
                            ch = "x";
                            break;
                        case 3:
                            ch = "y";
                            break;
                        case 4:
                            ch = "z";
                            break;
                    }
                    break;
                case 0:
                    ch = " ";
                    break;

            }
            message.append(ch);
        }
        System.out.println(message);
    }
}

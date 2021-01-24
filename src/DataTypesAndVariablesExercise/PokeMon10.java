package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double halfPower = powerN * 0.5;

        while (powerN >= distanceM){
            powerN-=distanceM;
            count++;
            if (powerN == halfPower){
                if (exhaustionFactorY>0){
                    powerN/=exhaustionFactorY;
                }
            }
        }
        System.out.println(powerN);
        System.out.println(count);
    }
}

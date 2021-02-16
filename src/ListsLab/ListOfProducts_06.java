package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = Integer.parseInt(scanner.nextLine());
        List<String> product = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            product.add(scanner.nextLine());
        }
        Collections.sort(product);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s%n",i+1 , product.get(i));
        }
    }
}

package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> list2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> mergingList = new ArrayList<>();

        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            mergingList.add(list1.get(i));
            mergingList.add(list2.get(i));
        }
        if (list1.size() < list2.size()) {
            for (int i = size; i < list2.size(); i++) {
                mergingList.add(list2.get(i));
            }
        } else {
            for (int i = size; i < list1.size(); i++) {
                mergingList.add(list1.get(i));
            }
        }
        printList(mergingList);
    }

    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}

package ProgrammingFundamentalsMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        String joinedList = numbers.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(joinedList);
    }
}

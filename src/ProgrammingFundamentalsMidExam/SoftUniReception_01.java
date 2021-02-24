package ProgrammingFundamentalsMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniReception_01 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);
        numbers.add(60);

        String joinedList = numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(joinedList);
    }
}

package Lessons.lesson_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_streams {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18);

        // Just print
        list.stream().filter(n -> n % 2 == 0).map(n -> n + " number").forEach(s -> System.out.print(s + " "));
        // Save to another list
        List<String> strings = list.stream().filter(n -> n%2 == 0).map(n -> n + " number").toList();

        System.out.println();
        System.out.println("FIRST LIST: "+ list);
        System.out.println("NEW LIST with strings: " + strings);
    }
}

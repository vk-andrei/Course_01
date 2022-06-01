package Lessons.lesson_11_Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        testSet();
    }

    private static void testSet() {
        Set<Integer> mySet = new HashSet<>();
        Collections.addAll(mySet, 3,1,1,1,1,1,3,3,23,11,11,23,5,6);
        System.out.println(mySet);

        Set<String> myTreeSet = new TreeSet<>();
        Collections.addAll(myTreeSet, "AAaa", "DDdd", "wwwW", "yY", "e");
        System.out.println(myTreeSet);



    }
}

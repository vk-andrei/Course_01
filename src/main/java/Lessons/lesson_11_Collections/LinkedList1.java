package Lessons.lesson_11_Collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class LinkedList1 {
    public static void main(String[] args) {
        testLinkedList();
    }

    private static void testLinkedList() {
        List<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(1);
        myList.add(8);
        myList.add(7);
        myList.add(1);
        myList.add(5);
        myList.add(2);
        myList.add(12);
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);




    }
}

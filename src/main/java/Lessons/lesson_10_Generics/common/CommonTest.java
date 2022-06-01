package Lessons.lesson_10_Generics.common;

import Lessons.lesson_05.Player;

import java.util.Scanner;

public class CommonTest {

    public static void main(String[] args) {
//        intTest();
//        stringTest();
        objTest();
    }

    private static void intTest() {
        IntStorage intStorage = new IntStorage(20);
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);

        intStorage.display();

        System.out.println("Find 2: " + intStorage.find(2));
        System.out.println("Find 5: " + intStorage.find(5));

        int lastValue = intStorage.get(intStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);
    }

    private static void stringTest() {
        StringStorage stringStorage = new StringStorage(20);
        stringStorage.add("a");
        stringStorage.add("b");
        stringStorage.add("c");

        stringStorage.display();

        System.out.println("Find a: " + stringStorage.find("a"));
        System.out.println("Find x: " + stringStorage.find("x"));

        String lastValue = stringStorage.get(stringStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);
    }

    private static void objTest() {
        ObjectStorage playerStorage = new ObjectStorage(20);
        playerStorage.add(new Player("Timofei"));


        ObjectStorage intStorage = new ObjectStorage(20);
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);
        intStorage.add(new Scanner(System.in));

        intStorage.display();

        System.out.println("Find 2: " + intStorage.find(2));
        System.out.println("Find 5: " + intStorage.find(5));

        int lastValue = (int)intStorage.get(intStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);


        ObjectStorage stringStorage = new ObjectStorage(20);
        stringStorage.add("a");
        stringStorage.add("b");
        stringStorage.add("c");
        stringStorage.add(1);

        stringStorage.display();

        System.out.println("Find a: " + stringStorage.find("a"));
        System.out.println("Find x: " + stringStorage.find("x"));

        String lastValue2 = (String)stringStorage.get(stringStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue2);

    }


}

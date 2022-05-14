package Lessons.lesson_07_Strings;

import java.util.Locale;

public class Methods_02 {
    public static void main(String[] args) {

        String a1 = "Cat";
        String a2 = "Dog";

        System.out.println(a1.compareTo(a2));

        String a3 = "     hello     ";
        String a4 = "     \t  \n ";
        System.out.println(a3.trim());
        System.out.println(a3);

        System.out.println(a3.isEmpty());
        System.out.println(a3.isBlank());
        System.out.println(a4.isEmpty());
        System.out.println(a4.isBlank());

        String a5 = "javasuperpuper";
        System.out.println(a5.substring(0, 1).toUpperCase() + a5.substring(1));
        System.out.println(a5.substring(1,3));

        System.out.println(a5.charAt(3));
        System.out.println(a5.indexOf("u", 2));

        String a6 = "Java is very simple, ah-ha-ha-ha-ha!";
        for (String s : a6.split(" ")) {   // в скобках РЕГУЛ ВЫРАЖЕНИЕ - можно указывать разные штучки
            System.out.println("word: " + s);
        }

        System.out.println(a6.replaceAll("a", "*"));

        System.out.println(a6.startsWith("J"));
        System.out.println(a6.endsWith("!"));

        System.out.println(String.join(", ", a1, a2, a3));


    }
}

package Lessons.lesson_11_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        testMap();
    }

    private static void testMap() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Russia", "Moscow");
        myMap.put("USA", "Washington");
        myMap.put("Russia", "Volgograd");
        myMap.put("Norway", "Oslo");
        myMap.put("Turkey", "Istanbul");

        /**** Way 1 to output ******/
        System.out.println("-------- OUTPUT with keySet ---------");
        for(String key: myMap.keySet()){
            System.out.printf("Key: %s \t\t value: %s\n", key, myMap.get(key));
        }
        /**** Way 2 to output ******/
        System.out.println("-------- OUTPUT with entrySet ---------");
        for (Map.Entry<String,String> stringStringEntry : myMap.entrySet()) {
            System.out.printf("Key: %s \t\t value: %s\n", stringStringEntry.getKey(), stringStringEntry.getValue());
        }

        /**** Way 3 to output ******/
        System.out.println("-------- OUTPUT with lambda ---------");
        myMap.forEach((key, value) -> System.out.printf("Key: %s \t\t value: %s\n", key,value));
    }
}
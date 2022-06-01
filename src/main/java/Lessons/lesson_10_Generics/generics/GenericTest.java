package Lessons.lesson_10_Generics.generics;

public class GenericTest {
    public static void main(String[] args) {
        /*GenericStorage<Player> playerStorage = new GenericStorage<>(20);
        playerStorage.add(new Player("Timofei"));*/


        GenericStorage<Integer> intStorage = new GenericStorage<>(20);
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);
//        intStorage.add(new Scanner(System.in));

        intStorage.display();

        System.out.println("Find 2: " + intStorage.find(2));
        System.out.println("Find 5: " + intStorage.find(5));

        int lastValue = intStorage.get(intStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);


        GenericStorage<String> stringStorage = new GenericStorage<>(20);
        stringStorage.add("a");
        stringStorage.add("b");
        stringStorage.add("c");
//        stringStorage.add(1);

        stringStorage.display();

        System.out.println("Find a: " + stringStorage.find("a"));
        System.out.println("Find x: " + stringStorage.find("x"));

        String lastValue2 = stringStorage.get(stringStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue2);
    }
}

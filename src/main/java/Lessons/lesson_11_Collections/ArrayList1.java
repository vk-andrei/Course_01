package Lessons.lesson_11_Collections;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        testArrList();
    }

    private static void testArrList() {
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("E");
        arrayList.add(1, "X");
        arrayList.add(2, "Y");
        System.out.println(arrayList);

        arrayList.remove("B");
        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println("pos 3: " + arrayList.get(3));

        //arrayList.clear();

        System.out.println("WAY 1:");
        /***** перебор 1 способ ******/
        for (String s : arrayList) {
            System.out.print("-> " + s);
        }

        System.out.println("\nWAY 2:");
        /*** перебор 2 способ ******/
        Iterator<?> iter = arrayList.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.print("-> " + s);
        }

        System.out.println("\nWAY 3:");
        /*** перебор 3 способ ******/
        arrayList.forEach(s -> System.out.print("-> " + s));
        //arrayList.forEach(System.out::print);

        /*** В массив из ArrayList ****/
        System.out.println("\n\nArray from ArrayList:");
        String[] strings = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));

        /*** В ArrayList из Array ****/
        System.out.println("\nArrayList from Array:");
        Collections.addAll(arrayList, strings);
        Collections.addAll(arrayList, "23", "ddDD");
        arrayList.forEach(s -> System.out.print("-> " + s));

        /***** Collections *****/
        System.out.println("\n\nShuffle:");
        Collections.shuffle(arrayList);
        arrayList.forEach(s -> System.out.print("s -> " + s));

        System.out.println("\n\nSort:");
        Collections.sort(arrayList);
        Collections.sort(arrayList, (s1, s2) -> s1.length() - s2.length());
        arrayList.forEach(s -> System.out.print("s -> " + s));
    }
}

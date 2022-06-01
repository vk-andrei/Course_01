package HomeTasks.task_11_Collections.task_01;
import java.util.*;

public class Start {
    public static void main(String[] args) {

        String[] words = new String[]{"Ford", "Volkswagen", "Lada", "Bugatti", "Cadillac", "Volkswagen",
                "Lada", "Volvo", "Dodge", "Jaguar", "Hyundai", "Chevrolet", "Ferrari", "Fiat", "Audi",
                "Suzuki", "Lada", "Dodge", "Dodge"};
        Integer[] ints = new Integer[]{12, 12, 1, 1, 3, 45, 45, 55, 10, 55};

        //uniqueNames(words);

        /******  MADE CLASS AnyArray FOR ALL TYPES *******/
        AnyArray<String> arr1 = new AnyArray<>(words);
        AnyArray<Integer> arr2 = new AnyArray<>(ints);

        arr1.uniqueNames();
        arr2.uniqueNames();
    }

    private static void uniqueNames(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);
        System.out.println("Qty unique names: " + set.size());
    }
}

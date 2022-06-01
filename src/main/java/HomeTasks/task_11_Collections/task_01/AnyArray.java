package HomeTasks.task_11_Collections.task_01;

import java.util.*;

public class AnyArray<T> {
    private final T[] data;

    public AnyArray(T[] anyData) {
        this.data = anyData;
    }

    public void uniqueNames() {
        Set<T> set = new HashSet<>(Arrays.asList(data));
        System.out.println(set);
        System.out.println("Qty unique names: " + set.size());
    }
}

package HomeTasks.task_14_LogsAndTesting.part_01_from_manual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModifyArray {

    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 100, 1, 4, 5, 6, 0};

        ModifyArray modifyArray = new ModifyArray();

        System.out.println(Arrays.toString(modifyArray.afterLast_4_Array(arr)));

    }

    public int[] afterLast_4_Array(int[] arr) {
        /** making List from Array **/
        List<Integer> list = new ArrayList<>(arr.length);
        for (int i : arr) {
            list.add(i);
        }
        //System.out.println(list);
        /** Checking for "4" **/
        int k = 0;
        for (int l : list) {
            if (l == 4) {
                k++;
            }
        }
        if (k == 0) {
            throw new RuntimeException("There is no \"4\" in array!!!");
        }

        /** Reversing list **/
        Collections.reverse(list);
        //System.out.println("REVERSE list: "+ list);

        /** Making STREAM of list **/
        Stream<Integer> Stream = list.stream();

        /** New list --> all numbers until we'll see "4" **/
        List<Integer> listWithout4 = Stream.takeWhile(n -> n != 4).collect(Collectors.toList());
        //System.out.println("list without 4: "+ listWithout4);

        /** Reversing list **/
        Collections.reverse(listWithout4);

        /** making Array from list **/

        return listWithout4.stream().mapToInt(i -> i).toArray();
    }
}

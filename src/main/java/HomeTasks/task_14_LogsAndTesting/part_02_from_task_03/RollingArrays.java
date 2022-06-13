package HomeTasks.task_14_LogsAndTesting.part_02_from_task_03;

import java.util.Arrays;

public class RollingArrays {

    /*public static void main(String[] args) {

        RollingArrays rollingArray = new RollingArrays();

        int[] myArray = new int[]{10, 20, 30, 40, 50};     //   50 40 10 20 30
        System.out.println(Arrays.toString(myArray));
        System.out.println("----PROCESS----");
        int n = 4;
        int[] changedArray = rollingArray.moveArray(myArray, n);
        System.out.println("-----RESULT----");
        System.out.println(Arrays.toString(changedArray));
    }*/

    public int[] moveArray(int[] anyArr, int n) {
        int shift = n % anyArr.length;   // убираем лишние сдвиги
        System.out.println("Move cells on: " + shift);
        ///////////// POSITIVE n ///////////////////
        if (n >= 0) {
            for (int k = 0; k < shift; k++) {

                int temp = anyArr[anyArr.length - 1];
                for (int i = 0; i < anyArr.length - 1; i++) {
                    anyArr [anyArr.length - 1 - i] = anyArr [anyArr.length - 1 - i - 1];
                }
                anyArr[0] = temp;
                System.out.println(Arrays.toString(anyArr));
            }
            return anyArr;
        }
        ///////////// NEGATIVE n ///////////////////
        for (int k = 0; k < Math.abs(shift); k++) {

            int temp = anyArr[0];
            for (int i = 0; i < anyArr.length - 1; i++) {
                anyArr [i] = anyArr [i + 1];
            }
            anyArr[anyArr.length - 1] = temp;
            System.out.println(Arrays.toString(anyArr));
        }
        return anyArr;
    }
}

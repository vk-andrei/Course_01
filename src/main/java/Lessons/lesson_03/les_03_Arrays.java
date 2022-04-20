package Lessons.lesson_03;
import java.util.Arrays;
import java.util.Collections;
public class les_03_Arrays {
    static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

      testOneArray();
      testTwoArray();
    }
    private static void testOneArray() {

        int[] data1 = new int[ARRAY_SIZE];
        int[] data2 = {3, 1, 2, 1, 5};

        data1[0] = 3;
        data1[3] = 7;
        data1[5] = 1;
        data1[1] = 10;
        data1[8] = 11;
        /*data1[9] = 0;*/ data1[data1.length - 1] = 0;

        for (int e: data1) {
            System.out.print(e + " ");
        }

        Arrays.sort(data1);     //    SORTING!!!!!!!!!!

        System.out.println("Sorted: " + Arrays.toString(data1));
        System.out.println("-------------");

        Integer[] integers = new Integer[10];  // ссылочный тип данных ОБОЛОЧКА (WRAPPER) для (int)
        Arrays.fill(integers, -1);         // fill with numbers
        integers[1] = 1;
        integers[6] = 4;
        integers[3] = 9;
        integers[2] = 2;
        System.out.println("Array of integers: " + Arrays.toString(integers));
        Arrays.sort(integers, Collections.reverseOrder());   // SORTING REVERSE
        System.out.println("Array of integers (sort reverse): " + Arrays.toString(integers));

        System.out.println("-------------");

        System.out.println(Arrays.toString(new int[]{1, 3, 6, 4, 3, 2}));   // without variable declaration
        System.out.println("-------------");

    }
    private static void testTwoArray() {

//        int[][] data1 = new int[3][5];
//        int[][] data2 = new int[5][];
//
//        int[][] deepData = {{1,2,3}, {1}, {1,2,3,4,5}};   -- stepped Array

        int[][] deepData1 = new int[ARRAY_SIZE][ARRAY_SIZE];

       /* deepData1[0][0] = 1;
        deepData1[0][1] = 1;
        deepData1[0][2] = 1;
        deepData1[1][0] = 1;
        deepData1[1][1] = 1;
        deepData1[1][2] = 1;
        deepData1[2][0] = 1;
        deepData1[2][1] = 1;
        deepData1[2][2] = 1;*/

        int n = 1;
        for (int i = 0; i < deepData1.length; i++) {
            for (int j = 0; j < deepData1[i].length; j++) {
                deepData1[i][j] = n++;
            }
        }
        System.out.println("2D Array (way 1): " + Arrays.deepToString(deepData1));  // ----- PRINT 2D Array    .deepToString
        System.out.println("-------------");

        System.out.println("2D Array (way 2): ");
        for (int i = 0; i < deepData1.length; i++) {
            for (int j = 0; j < deepData1[i].length; j++) {
                System.out.printf("%4d ", deepData1[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------");
        System.out.println("2D Array (way 2): ");

        for (int[] row : deepData1) {
            for(int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }









    }


}

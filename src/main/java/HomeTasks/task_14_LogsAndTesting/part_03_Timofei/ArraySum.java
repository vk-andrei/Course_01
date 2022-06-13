package HomeTasks.task_14_LogsAndTesting.part_03_Timofei;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {

        /*ArraySum arraySum = new ArraySum();

        String[][] myStrArr = new String[4][4];
        myStrArr[0] = new String[]{"01", "02", "03", "04"};
        myStrArr[1] = new String[]{"11", "12", "13", "14"};
        myStrArr[2] = new String[]{"21", "22", "23", "24"};
        myStrArr[3] = new String[]{"31", "3f2", "33", "34"};

        System.out.println(Arrays.deepToString(myStrArr));
        System.out.println("Sum of array elements: " + arraySum.checkArray(myStrArr));*/
    }

    public int checkArray(String[][] myStrArr) {
        int rows = myStrArr.length;
        int col = myStrArr[0].length;
        if (rows != 4 || col != 4) {
            throw new MyArraySizeException();
        }

        int sumElem = 0;
        for (int i = 0; i < myStrArr.length; i++) {
            for (int j = 0; j < myStrArr[0].length; j++) {
                int k = 0;
                try {
                    k = Integer.parseInt(myStrArr[i][j]);
                } catch (NumberFormatException e) {
                    //e.printStackTrace();
                    throw new MyArrayDataException(i + 1, j + 1);
                }
                sumElem += k;
            }
        }
        return sumElem;
    }
}

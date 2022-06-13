package HomeTasks.task_14_LogsAndTesting.part_03_Timofei;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArraySumTest {

    private ArraySum arraySum;

    @BeforeEach
    void start() {
        arraySum = new ArraySum();
    }


    @DisplayName("Checking for exception SIZE (yes)")
    @Test
    void test1() {
        String[][] expected = new String[3][4];
        expected[0] = new String[]{"01", "02", "03", "04"};
        expected[1] = new String[]{"11", "12", "13", "14"};
        expected[2] = new String[]{"21", "22", "23", "24"};
        //expected[3] = new String[]{"31", "3f2", "33", "34"};

        Assertions.assertThrows(MyArraySizeException.class, () -> {
            arraySum.checkArray(expected);
        });
    }

    @DisplayName("Checking for exception SIZE (no)")
    @Test
    void test2() {
        String[][] expected = new String[4][4];
        expected[0] = new String[]{"01", "02", "03", "04"};
        expected[1] = new String[]{"11", "12", "13", "14"};
        expected[2] = new String[]{"21", "22", "23", "24"};
        expected[3] = new String[]{"31", "32", "33", "34"};

        Assertions.assertThrows(MyArraySizeException.class, () -> {
            arraySum.checkArray(expected);
        });
    }

    @DisplayName("Checking for exception DATA (yes)")
    @Test
    void test3() {
        String[][] expected = new String[4][4];
        expected[0] = new String[]{"01", "02", "03", "04"};
        expected[1] = new String[]{"11", "12", "13", "14"};
        expected[2] = new String[]{"21", "22", "23", "24"};
        expected[3] = new String[]{"31", "3fff2", "33", "34"};

        Assertions.assertThrows(MyArrayDataException.class, () -> {
            arraySum.checkArray(expected);
        });
    }

    @DisplayName("Checking for exception DATA (no)")
    @Test
    void test4() {
        String[][] expected = new String[4][4];
        expected[0] = new String[]{"01", "02", "03", "04"};
        expected[1] = new String[]{"11", "12", "13", "14"};
        expected[2] = new String[]{"21", "22", "23", "24"};
        expected[3] = new String[]{"31", "32", "33", "34"};

        Assertions.assertThrows(MyArrayDataException.class, () -> {
            arraySum.checkArray(expected);
        });
    }
}
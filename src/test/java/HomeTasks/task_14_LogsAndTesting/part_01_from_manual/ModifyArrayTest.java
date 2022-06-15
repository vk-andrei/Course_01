package HomeTasks.task_14_LogsAndTesting.part_01_from_manual;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ModifyArrayTest {

    private ModifyArray modifyArray;

    @BeforeEach
    void start() {
        System.out.println("Start checking:");
        modifyArray = new ModifyArray();
    }

    @AfterEach
    void finish() {
        System.out.println("End checking.");
    }

    @Test
    public void test1() {
        //ModifyArray modifyArray = new ModifyArray();
        int[] expected = new int[]{5, 6, 0};
        Assertions.assertArrayEquals(expected, modifyArray.afterLast_4_Array(new int[]{2, 5, 4, 100, 1, 4, 5, 6, 0}));
    }

    @Test
    public void test2() {
        //ModifyArray modifyArray = new ModifyArray();
        int[] expected = new int[]{1, 7};
        Assertions.assertArrayEquals(expected, modifyArray.afterLast_4_Array(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void test3() {

        int[] expected = new int[]{1, 7};
        int[] input = new int[] {1, 2, 2, 3, 0, 1, 7};
        Assertions.assertArrayEquals(expected, modifyArray.afterLast_4_Array(input));
        //Assertions.assertArrayEquals(expected, modifyArray.afterLast_4_Array(new int[]{1, 2, 2, 3, 0, 1, 7}));
    }
}
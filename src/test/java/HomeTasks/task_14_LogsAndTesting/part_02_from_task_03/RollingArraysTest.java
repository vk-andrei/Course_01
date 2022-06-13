package HomeTasks.task_14_LogsAndTesting.part_02_from_task_03;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RollingArraysTest {

    private RollingArrays rollingArrays;

    @BeforeEach
    void start() {
        rollingArrays = new RollingArrays();
        System.out.println("Start checking:");
    }

    @AfterEach
    void end() {
        System.out.println("End checking");
    }

    @Test
    void test1() {
        int[] expected = new int[]{10, 20, 30, 40, 50};
        Assertions.assertArrayEquals(expected, rollingArrays.moveArray(new int[]{10, 20, 30, 40, 50}, 4));
    }

    @Test
    void test2() {
        int[] expected = new int[]{10, 20, 30, 40, 50};
        Assertions.assertArrayEquals(expected, rollingArrays.moveArray(new int[]{10, 20, 30, 40, 50}, 5));
    }

    @DisplayName("Parameterized Test")
    @ParameterizedTest
    @MethodSource("data")
    void paramTest(int[] expected, int[] arr, int n) {
        Assertions.assertArrayEquals(expected, rollingArrays.moveArray(arr, n));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(new int[]{11, 12, 13}, new int[]{13, 11, 12}, 4),
                Arguments.arguments(new int[]{0, 1, 3}, new int[]{3, 0, 1}, 2),
                Arguments.arguments(new int[]{0, 1, 4, 4, 5, 6}, new int[]{0, 1, 4, 4, 5, 6}, 6),
                Arguments.arguments(new int[]{11, 12, 13}, new int[]{13, 11, 12}, 4)
        );
    }
}
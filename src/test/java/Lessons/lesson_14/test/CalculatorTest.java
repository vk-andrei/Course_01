package Lessons.lesson_14.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Random random;
    private Calculator calculator;


    @BeforeEach
        // - method before each test
    void startup() {
        System.out.println("TEST begin!");
        calculator = new Calculator();
    }

    @AfterEach
    void shutdown() {
        System.out.println("TEST finished!");
    }

    @AfterAll
    static void mainEnd() {
        System.out.println("MAIN END");
    }

    @BeforeAll
    static void mainStart() {
        System.out.println("MAIN START");
        random = new Random();
    }


    @Test
    void testAdd1() {
        //Calculator calculator = new Calculator();
        Assertions.assertEquals(12, calculator.add(5, 7));
    }

    @Test
    void testAdd2() {
        //Calculator calculator = new Calculator();
        Assertions.assertEquals(8, calculator.add(-8, 16));

    }

    @DisplayName("Adding biggest numbers")
    @Test
    void testAdd3() {
        //Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @DisplayName("Checking exception")
    @Test
    void testException() {

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(7, 0));
    }

    @DisplayName("Checking timeout and dividing")
    @Test
    void testTimeout() {

        Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(1500);
            Assertions.assertEquals(0, calculator.div(Integer.MAX_VALUE, Integer.MIN_VALUE));
        });
    }


    @DisplayName("Parameterized test")
    @ParameterizedTest
    @MethodSource("data")
    void paramTest(int expected, int a, int b) {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
            Assertions.assertEquals(expected, calculator.add(a, b));
        });
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(6, 3, 3),
                Arguments.arguments(0, Integer.MIN_VALUE, Integer.MAX_VALUE),
                Arguments.arguments(-5, 2, -7),
                Arguments.arguments(Integer.MIN_VALUE, Integer.MAX_VALUE, 1),
                Arguments.arguments(12, -24, 12)
        );
    }

}
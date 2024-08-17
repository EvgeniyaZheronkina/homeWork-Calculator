package pro.sky.calculator.service;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParametrizedTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    static Stream <Arguments> data(){
        return Stream.of(
                Arguments.of(10, 2),
                Arguments.of(10, -2),
                Arguments.of(-10, -2),
                Arguments.of(-200, 5),
                Arguments.of(222, 2),
                Arguments.of(-200, -5)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int a, int b) {
        int actual = calculatorService.plus(a, b);
        int expected = a + b;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("data")
    void minus(int a, int b) {
        int actual = calculatorService.minus(a, b);
        int expected = a - b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void multiply(int a, int b) {
        int actual = calculatorService.multiply(a, b);
        int expected = a * b;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("data")
    void divide(int a, int b) throws Exception {
        int actual = calculatorService.divide(a, b);
        int expected = a / b;
        Assertions.assertEquals(actual, expected);
    }

}

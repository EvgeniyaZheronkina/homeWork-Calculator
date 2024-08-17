package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exeption.DivisionByZeroExeption;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    @DisplayName("Проверка сложения")
    void plus_when_negative_result() {
        int actual = calculatorService.plus(-2, -3);

        Assertions.assertEquals(-5, actual);
    }

    @Test
    void plus_when_positive_result() {
        int actual = calculatorService.plus(2, 3);

        Assertions.assertEquals(5, actual);
    }

    @Test
    @DisplayName("Проверка вычитания")
    void minus_when_negative_result() {
        int actual = calculatorService.minus(-2, 3);

        Assertions.assertEquals(-5, actual);
    }

    @Test
    void minus_when_positive_result() {
        int actual = calculatorService.minus(7, 3);

        Assertions.assertEquals(4, actual);
    }
    @Test
    @DisplayName("Проверка умножения")
    void multiply_when_negative_result() {
        int actual = calculatorService.multiply(-2, 3);

        Assertions.assertEquals(-6, actual);
    }

    @Test
    void multiply_when_positive_result() {
        int actual = calculatorService.multiply(-7, -3);

        Assertions.assertEquals(21, actual);
    }

    @Test
    @DisplayName("Проверка деления")
    void divide_when_negative_result() throws Exception {
        int actual = calculatorService.divide(9, -3);

        Assertions.assertEquals(-3, actual);
    }

    @Test
    void divide_when_positive_result() throws Exception {
        int actual = calculatorService.divide(21, 3);

        Assertions.assertEquals(7, actual);
    }

    @Test
    void when_divide_by_zero_then_throw_exception() throws Exception {
        Assertions.assertThrows(DivisionByZeroExeption.class, () -> {
            calculatorService.divide(9, 0);
        });
    }


}

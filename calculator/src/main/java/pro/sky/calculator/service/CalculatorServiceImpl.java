package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exeption.DivisionByZeroExeption;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus (int a, int b) {
        return a + b;
    }

    @Override
    public int minus (int a, int b) {
        return a - b;
    }

    @Override
    public int multiply (int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroExeption();
        }
        return a / b;
    }

}

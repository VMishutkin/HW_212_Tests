package mish.vlad.springtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CalculatorParamsTest {

    private final CalculatorController out = new CalculatorController(new CalculatorServiceImpl());

    public static Stream<Arguments> sumParamsTest() {
        return Stream.of(
                Arguments.of(NumberConstants.NUM_1, NumberConstants.NUM_2),
                Arguments.of(NumberConstants.NUM_1, NumberConstants.NUM_0),
                Arguments.of(NumberConstants.NUM_2, NumberConstants.WRONG_NUM)
        );
    }

    @ParameterizedTest
    @MethodSource("sumParamsTest")
    public void sumParamsTest(String num1, String num2) {
        String result = out.plus(num1, num2);
    }
    @ParameterizedTest
    @MethodSource("sumParamsTest")

    public void minusParamsTest(String num1, String num2) {
        String result = out.minus(num1, num2);
    }
    @ParameterizedTest
    @MethodSource("sumParamsTest")
    public void multiplyParamsTest(String num1, String num2) {
        String result = out.multiply(num1, num2);
    }
    @ParameterizedTest
    @MethodSource("sumParamsTest")
    public void divideTest(String num1, String num2) {
        String result = out.divide(num1, num2);
    }


}


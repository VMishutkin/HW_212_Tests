package mish.vlad.springtest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorControllerTest {
    private CalculatorController calculatorController;
    private CalculatorService calculatorService;



    public CalculatorControllerTest() {
        calculatorService = new CalculatorServiceImpl();
        calculatorController = new CalculatorController(calculatorService);

    }

    @Test
    public void plusTest() {

        String sumControllerResult = calculatorController.plus(NumberConstants.NUM_1, NumberConstants.NUM_2);
        String testResult = String.format("%s + %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_2, Integer.parseInt(NumberConstants.NUM_1) + Integer.parseInt(NumberConstants.NUM_2));

        assertEquals(sumControllerResult, testResult);
        sumControllerResult = calculatorController.plus(NumberConstants.NUM_1, NumberConstants.NUM_0);
        testResult = String.format("%s + %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_0, Integer.parseInt(NumberConstants.NUM_1) + Integer.parseInt(NumberConstants.NUM_0));
        assertEquals(sumControllerResult, testResult);
        assertThrows(IllegalArgumentException.class, () -> calculatorController.plus(NumberConstants.WRONG_NUM,NumberConstants.NUM_1));



    }

    @Test
    public void minusTest() {

        String minusControllerResult = calculatorController.minus(NumberConstants.NUM_1, NumberConstants.NUM_2);
        String testResult = String.format("%s - %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_2, Integer.parseInt(NumberConstants.NUM_1) - Integer.parseInt(NumberConstants.NUM_2));

        assertEquals(minusControllerResult, testResult);
        minusControllerResult = calculatorController.minus(NumberConstants.NUM_1, NumberConstants.NUM_0);
        testResult = String.format("%s - %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_0, Integer.parseInt(NumberConstants.NUM_1) - Integer.parseInt(NumberConstants.NUM_0));
        assertEquals(minusControllerResult, testResult);

        assertThrows(IllegalArgumentException.class, () -> calculatorController.minus(NumberConstants.WRONG_NUM,NumberConstants.NUM_1));
    }

    @Test
    public void multiplyTest() {

        String multiplyControllerResult = calculatorController.multiply(NumberConstants.NUM_1, NumberConstants.NUM_2);
        String testResult = String.format("%s * %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_2, Integer.parseInt(NumberConstants.NUM_1) * Integer.parseInt(NumberConstants.NUM_2));

        assertEquals(multiplyControllerResult, testResult);
        multiplyControllerResult = calculatorController.multiply(NumberConstants.NUM_1, NumberConstants.NUM_0);
        testResult = String.format("%s * %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_0, Integer.parseInt(NumberConstants.NUM_1) * Integer.parseInt(NumberConstants.NUM_0));
        assertEquals(multiplyControllerResult, testResult);
        assertThrows(IllegalArgumentException.class, () -> calculatorController.multiply(NumberConstants.WRONG_NUM,NumberConstants.NUM_1));

    }
    @Test
    public void divideTest() {

        String divideControllerResult = calculatorController.divide(NumberConstants.NUM_1, NumberConstants.NUM_2);
        String testResult = String.format("%s / %s = %d", NumberConstants.NUM_1, NumberConstants.NUM_2, Integer.parseInt(NumberConstants.NUM_1) / Integer.parseInt(NumberConstants.NUM_2));

        assertEquals(divideControllerResult, testResult);
        assertThrows(IllegalArgumentException.class, () -> calculatorController.plus(NumberConstants.WRONG_NUM,NumberConstants.NUM_1));
        assertThrows(IllegalArgumentException.class, () -> calculatorController.plus(NumberConstants.WRONG_NUM,NumberConstants.NUM_0));

    }





}

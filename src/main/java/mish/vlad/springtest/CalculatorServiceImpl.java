package mish.vlad.springtest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(String num1, String num2) {
        if (checkInput(num1, num2)) {
            return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
        }
        return null;
    }


    @Override
    public String minus(String num1, String num2) {
        if (checkInput(num1, num2)) {
            return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
        }
        return null;
    }

    @Override
    public String multiply(String num1, String num2) {

        return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    @Override
    public String divide(String num1, String num2) {
        if (!checkInput(num1, num2)) {
            return null;
        }
        if (Integer.parseInt(num2) == 0) {
            throw new IllegalArgumentException("Деление на 0");
        }
        return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));

    }


    private boolean checkInput(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введите оба параметра");
        }
        if (!isNumeric(num1) || !isNumeric(num2)) {
            throw new IllegalArgumentException("Введите 2 числа");
        }
        return true;
    }


    private boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

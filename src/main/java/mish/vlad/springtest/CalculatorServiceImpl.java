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
        if (num1 == null || num2 == null) {
            return "Введите параметры num1 и num2";
        }
        if (!isNumeric(num1) || !isNumeric(num2)) {
            return "Параметры должны быть целым числом";
        }
        return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }


    @Override
    public String minus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Введите параметры num1 и num2";
        }
        if (!isNumeric(num1) || !isNumeric(num2)) {
            return "Параметры должны быть целым числом";
        }
        return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Введите параметры num1 и num2";
        }
        if (!isNumeric(num1) || !isNumeric(num2)) {
            return "Параметры должны быть целым числом";
        }
        return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    @Override
    public String divide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Введите параметры num1 и num2";
        }
        if (!isNumeric(num1) || !isNumeric(num2)) {
            return "Параметры должны быть целым числом";
        }
        if (Integer.parseInt(num2) == 0) {
            return "Деление на 0";
        }
        return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));

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

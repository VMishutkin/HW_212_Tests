package mish.vlad.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")

@RestController
public class CalculatorController {
    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings(){
        return calculatorService.greetings();
    }


    @GetMapping("/plus")
    public String plus(String num1, String num2){
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(String num1, String num2){
        return calculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(String num1, String num2){
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(String num1, String num2){
        return calculatorService.divide(num1, num2);
    }




}

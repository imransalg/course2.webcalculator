package pro.sky.java.course2.webcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path = "/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam (required = false) String num1, @RequestParam (required = false) String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка. Введите параметры";
        }
        return calculatorService.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam (required = false) String num1, @RequestParam (required = false) String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка. Введите параметры";
        }
        return calculatorService.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam (required = false) String num1, @RequestParam (required = false) String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка. Введите параметры";
        }
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam (required = false) String num1, @RequestParam (required = false) String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка. Введите параметры";
        }
        return calculatorService.divide(num1,num2);
    }
}

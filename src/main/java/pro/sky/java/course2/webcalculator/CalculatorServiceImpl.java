package pro.sky.java.course2.webcalculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greetings() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(String  num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num1);
        int result = n1 + n2;
        return num1 + " + " + num2 + " = " + result;
    }
    public String minus(String  num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num1);
        int result = n1 - n2;
        return num1 + " - " + num2 + " = " + result;
    }
    public String multiply(String  num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num1);
        int result = n1 * n2;
        return num1 + " * " + num2 + " = " + result;
    }
    public String divide(String  num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num1);
        int result = n1 / n2;
        return num1 + " / " + num2 + " = " + result;
    }
}

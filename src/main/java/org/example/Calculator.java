package org.example;

import io.qase.api.annotation.Step;
import java.util.Scanner;

public class Calculator {

    @Step("add {x} + {y}")
    public int add(int x, int y) {
        return x + y;
    }

    @Step("subtract {x} - {y}")
    public int subtract(int x, int y) {
        return x - y;
    }

    @Step("multiply {x} * {y}")
    public int multiply(int x, int y) {
        return x * y;
    }

    @Step("divide {x} / {y}")
    public int divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();

        System.out.print("Choose an operation (+ for addition, - for subtraction, * for multiplication, / for division): ");
        String operation = scanner.next();

        int result = 0;

        switch (operation) {
            case "+":
                result = calculator.add(x, y);
                break;
            case "-":
                result = calculator.subtract(x, y);
                break;
            case "*":
                result = calculator.multiply(x, y);
                break;
            case "/":
                try {
                    result = calculator.divide(x, y);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero");
                }

                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("The result is: " + result);
    }
}










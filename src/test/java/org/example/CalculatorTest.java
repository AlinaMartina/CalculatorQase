package org.example;

import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @QaseTitle("Add with positive number")
    public void add_withPositiveNumber_shouldReturnPositiveInteger(){
        // Given
        Calculator calculator = new Calculator();
        int x = 3;
        int y = 7;

        // When
        int sum = calculator.add(x, y);

        // Then
        assertEquals(10, sum);
    }

    @Test
    @QaseTitle("Subtract with negative number")
    public void subtract_withNegativeNumber_shouldReturnNegativeInteger(){
        // Given
        Calculator calculator = new Calculator();
        int x = 7;
        int y = 3;

        // When
        int sum = calculator.subtract(x, y);

        //Then
        assertEquals(4, sum);


    }

    @Test
    @QaseTitle("Multiply with positive number")
    public void multiply_withPositiveNumber_ShouldReturnPositiveInteger(){
        //Given
        Calculator calculator = new Calculator();
        int x = 7;
        int y = 3;

        //When
        int sum = calculator.multiply(x,y);

        //Then
        assertEquals(21, sum);
    }

    @Test
    @QaseTitle("Divide with positive number")
    public void divide_withPositiveNumber_shouldReturnPositiveInteger(){
        //Given
        Calculator calculator = new Calculator();
        int x = 4;
        int y = 2;

        //When
        int sum = calculator.divide (x, y);

        //Then
        assertEquals(2, sum);
    }

    @Test
    @QaseTitle("Divide with zero")
    public void divide_withZero(){
        //Given
        Calculator calculator = new Calculator();
        int x = 5;
        int y = 0;

        //When
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> calculator.divide(x, y));

        //Then
        assertEquals("/ by zero", exception.getMessage());
    }
}









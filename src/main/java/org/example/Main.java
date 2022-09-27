package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        int result = calculator.addListNumbers(numbers);
        System.out.println(result);

    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1);


        int result = calculator.addListNumbers(numbers);
        System.out.println(result);

        result = calculator.addOddNumbers(numbers2);
        System.out.println(result);

    }
}
package org.example;

import java.util.List;

public class Calculator {

    public int addListNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    public int addOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
    }

}

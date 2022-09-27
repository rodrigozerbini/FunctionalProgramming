package org.example;

import java.util.List;

public class Calculator {

    public int addListNumbers(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}

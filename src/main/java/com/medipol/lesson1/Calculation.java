package com.medipol.lesson1;

import java.util.ArrayList;

public class Calculation {

    public int sum(int input1, int input2) {
        return input1 + input2;
    }

    public int sizeOfList(ArrayList<String> inputs) {

        int counter = 0;
        for (String each : inputs) {
            counter++;
        }
        return counter;
    }

    public int countOfWordsWhichContainsA(ArrayList<String> inputs) {

        int counter = 0;
        for (String each : inputs) {
            if (containsA(each)){
                counter++;
            }
        }
        return counter;
    }

    public boolean containsA(String input) {

        if (input == null){
            return false;
        }
        return input.toLowerCase().contains("a");
    }

    public double divide(double divided, double divider) {
        if (divider == 0d) {
            throw new RuntimeException("divider should not be zero");
        }
        return divided / divider;
    }
}

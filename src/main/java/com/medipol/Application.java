package com.medipol;

import com.medipol.lesson1.Calculation;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        System.out.println("hello world!");

        System.out.println("contains A for medipol : " + (new Calculation().containsA("medipol")) );
        System.out.println("contains A gergedan : " + (new Calculation().containsA("gergedan")) );

        final ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("armut");
        inputs.add("furkan");
        inputs.add("ananas");
        inputs.add("medipol");
//        inputs.add("tugce");
//        inputs.add("gergedan");

        int count = new Calculation().countOfWordsWhichContainsA(inputs);

        System.out.println("assert result : " + (count == 3));

        inputs.add("gergedan");


        System.out.println("assert result : " +
            (new Calculation().countOfWordsWhichContainsA(inputs) == 4)
        );



    }
}

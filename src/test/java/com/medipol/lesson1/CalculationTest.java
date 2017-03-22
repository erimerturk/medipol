package com.medipol.lesson1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculationTest {


    @Test
    public void shouldSumInputs() {

        final Calculation calculation = new Calculation();

        int response = calculation.sum(1,2);
        assertTrue(response == 3);

    }


    @Test
    public void shouldSumInputsWithParams() {

        final Calculation calculation = new Calculation();

        int response = calculation.sum(3, 5);
        assertTrue(response == 8);

    }

    @Test
    public void shouldDivide() {

        final Calculation calculation = new Calculation();
        double response = calculation.divide(10d, 2d);
        assertTrue(response == 5d);
    }

    @Test
    public void shouldBeZeroWhenDividerIsZero() {

        final Calculation calculation = new Calculation();
        double response = calculation.divide(0d, 2d);
        assertTrue(response == 0d);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowRuntimeExceptionWhenDivisorIsZeroOnDivide() {
        final Calculation calculation = new Calculation();
        double response = calculation.divide(10d, 0d);
        assertTrue(response == 5d);
    }

    @Test
    public void shouldReturnCountOfWordsWhichContainsA(){

        final ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("armut");
        inputs.add("furkan");
        inputs.add("ananas");
        inputs.add("medipol");
        inputs.add("tugce");
        inputs.add("gergedan");

        int count = new Calculation().countOfWordsWhichContainsA(inputs);

        assertTrue(count == 4);
        assertTrue(new Calculation().sizeOfList(inputs) == 6);
    }

    @Test
    public void shouldReturnCountOfWordsWhichContainsA2(){

        final ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("armut");
        inputs.add("furkan");
        inputs.add("ananas");
        inputs.add("medipol");

        int count = new Calculation().countOfWordsWhichContainsA(inputs);

        assertTrue(count == 3);
        assertTrue(new Calculation().sizeOfList(inputs) == 4);
    }

    @Test
    public void shouldConsiderNull(){

        final ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("armut");
        inputs.add("furkan");
        inputs.add("ananas");
        inputs.add(null);
        inputs.add("medipol");

        int count = new Calculation().countOfWordsWhichContainsA(inputs);

        assertTrue(count == 3);
        assertTrue(new Calculation().sizeOfList(inputs) == inputs.size());
    }

    @Test
    public void shouldCheckContainsA(){

        assertFalse(new Calculation().containsA("medipol"));
        assertTrue(new Calculation().containsA("gergedan"));

    }
}

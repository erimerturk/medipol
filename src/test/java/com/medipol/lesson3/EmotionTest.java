package com.medipol.lesson3;

import org.junit.Test;

public class EmotionTest {

    @Test
    public void testToString() throws Exception {


        final Emotion cry = new Emotion(EmotionType.CRY, 20, 80);

        System.out.println(cry);

        final Emotion happy = new Emotion(EmotionType.HAPPY, 50, 100);

        System.out.println(happy);

    }
}
package com.medipol.lesson3;

import org.junit.Test;

import java.util.List;

public class WordsTest {


    @Test
    public void testEmotionWords() throws Exception {

        final Words words = new Words();

        final List<String> sadWords = words.getWordsMap().get(EmotionType.SAD);

        System.out.println(sadWords);

        final List<String> angryWords = words.getWordsMap().get(EmotionType.ANGRY);

        System.out.println(angryWords);

    }
}
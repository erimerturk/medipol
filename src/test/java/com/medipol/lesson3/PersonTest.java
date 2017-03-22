package com.medipol.lesson3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    public void testToString() throws Exception {

        List<Emotion> emotions = new ArrayList<Emotion>();
        emotions.add(new Emotion(EmotionType.ENVY, 10, 20));
        emotions.add(new Emotion(EmotionType.SAD, 0, 10));
        emotions.add(new Emotion(EmotionType.HAPPY, 70, 100));
        emotions.add(new Emotion(EmotionType.CRY, 10, 30));

        final Person person = new Person(EyesColour.BLACK, emotions, 170);
        System.out.println(person);

        List<Emotion> angry = new ArrayList<Emotion>();
        angry.add(new Emotion(EmotionType.ANGRY, 100, 1000));

        final Person angryPerson = new Person(EyesColour.GREEN, angry, 180);
        System.out.println(angryPerson);


    }
}

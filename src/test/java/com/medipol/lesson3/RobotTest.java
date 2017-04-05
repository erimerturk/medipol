package com.medipol.lesson3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RobotTest {

    @Test
    public void testToString() throws Exception {

        List<Emotion> emotions = new ArrayList<Emotion>();
        emotions.add(new Emotion(EmotionType.ENVY, 10, 20));
        emotions.add(new Emotion(EmotionType.SAD, 0, 10));
        emotions.add(new Emotion(EmotionType.HAPPY, 70, 100));
        emotions.add(new Emotion(EmotionType.CRY, 10, 30));

        final Robot robot = new Robot(EyesColour.BLACK, emotions, 170);
        System.out.println(robot);

        final Words words = new Words();


        for (int i = 0; i < 100; i ++){
            final String speak = robot.speak(words);
            System.out.println(speak);
        }





        List<Emotion> angry = new ArrayList<Emotion>();
        angry.add(new Emotion(EmotionType.ANGRY, 100, 1000));

        final Robot angryRobot = new Robot(EyesColour.GREEN, angry, 180);
        System.out.println(angryRobot);


    }
}

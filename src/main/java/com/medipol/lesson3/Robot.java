package com.medipol.lesson3;

import java.util.List;
import java.util.Random;

public class Robot {
    private EyesColour eyesColour;
    private List<Emotion> emotions;
    private int height;

    public Robot(EyesColour eyesColour, List<Emotion> emotions, int height) {
        this.eyesColour = eyesColour;
        this.emotions = emotions;
        this.height = height;
    }

    public EyesColour getEyesColour() {
        return eyesColour;
    }

    public List<Emotion> getEmotions() {
        return emotions;
    }



    @Override
    public String toString() {
        return "Robot{" +
                "eyesColour=" + eyesColour +
                ", emotions=" + emotions +
                ", height=" + height +
                '}';
    }

    public String speak(Words words) {

        final Random random = new Random();

        final int emotionIndex = random.nextInt(emotions.size());

        final Emotion emotion = emotions.get(emotionIndex);


        System.out.println("selected emotion : " +  emotion);
        final List<String> strings = words.getWordsMap().get(emotion.getType());

        if (strings == null){
            return "i dont know";
        }


        final int wordIndex = random.nextInt(strings.size());

        return strings.get(wordIndex);

    }
}

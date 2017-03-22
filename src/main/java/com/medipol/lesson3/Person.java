package com.medipol.lesson3;

import java.util.List;

public class Person {
    private EyesColour eyesColour;
    private List<Emotion> emotions;
    private int height;

    public Person(EyesColour eyesColour, List<Emotion> emotions, int height) {
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
        return "Person{" +
                "eyesColour=" + eyesColour +
                ", emotions=" + emotions +
                ", height=" + height +
                '}';
    }
}

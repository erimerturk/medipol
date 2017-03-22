package com.medipol.lesson3;

public class Emotion {
    private EmotionType type;
    private int lowerLimit = 0;
    private int upperLimit = 100;

    public Emotion(EmotionType type, int lowerLimit, int upperLimit) {
        this.type = type;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public EmotionType getType() {
        return type;
    }

    public void setType(EmotionType type) {
        this.type = type;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }


    @Override
    public String toString() {
        return "" +
                "type=" + type +
                ", lowerLimit=" + lowerLimit +
                ", upperLimit=" + upperLimit ;
    }
}

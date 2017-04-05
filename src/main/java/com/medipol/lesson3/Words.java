package com.medipol.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {

    private Map<EmotionType, List<String>> wordsMap = new HashMap<EmotionType, List<String>>();

    public Words() {


        //SAD, CRY, ENVY, HAPPY, ANGRY;
        List<String> sadWords = new ArrayList<String>();
        sadWords.add("i am so bad");
        sadWords.add("sad");
        sadWords.add("hell");
        wordsMap.put(EmotionType.SAD, sadWords);

        List<String> cryWords = new ArrayList<String>();
        cryWords.add("cry");
        wordsMap.put(EmotionType.CRY, cryWords);


        List<String> happWords = new ArrayList<String>();
        happWords.add("happy");
        happWords.add("i am hapyu");
        happWords.add("hello world!");
        happWords.add("merhaba dünya");
        wordsMap.put(EmotionType.HAPPY,  happWords);

    }

    public Map<EmotionType, List<String>> getWordsMap() {
        return wordsMap;
    }
}

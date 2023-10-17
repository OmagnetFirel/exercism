package main;

import java.util.HashMap;

public class IsogramChecker {

    public boolean isIsogram(String phrase) {
        boolean hasRepeatedLetter = false;
        char[] letters = phrase.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();
        for(char c: letters){
            if(!(c == '-' || Character.isWhitespace(c))) {
                char lowerC = Character.toLowerCase(c);
                if (counts.containsKey(lowerC)) {
                    counts.put(lowerC, counts.get(lowerC) + 1);
                } else {
                    counts.put(lowerC, 1);
                }
            }
        }

        for(char key: counts.keySet()){
            int times = counts.get(key);
            if(times>1){
                hasRepeatedLetter = true;
            }
        }
        return !hasRepeatedLetter;
    }

}

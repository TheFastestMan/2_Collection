package org.example.map.mapTask3;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> getCharsCount(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char chr : str.toCharArray()) {
            charCountMap.put(chr, charCountMap.getOrDefault(chr, 0) + 1);
        }
        return charCountMap;
    }

}

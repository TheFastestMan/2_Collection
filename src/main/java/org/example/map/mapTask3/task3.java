package org.example.map.mapTask3;

import java.util.Map;

import static org.example.map.mapTask3.CharacterCounter.getCharsCount;

public class task3 {
    public static void main(String[] args) {

        Map<Character, Integer> characters = getCharsCount("Hello");

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}


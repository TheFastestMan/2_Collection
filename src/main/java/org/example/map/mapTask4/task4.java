package org.example.map.mapTask4;

import java.util.HashMap;
import java.util.Map;

public class task4 {
    public static void main(String[] args) {
        System.out.println(convertToArabic("XXXL"));

    }

    public static int convertToArabic(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int previous = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {

            int current = romanMap.get(roman.charAt(i));

            if (current < previous) {
                result = result - current;
            } else {
                result = result + current;
            }
            previous = current;
        }

        return result;
    }
}

package org.example.map.mapTask5;

import java.util.HashMap;
import java.util.Map;

public class task5 {
    public static void main(String[] args) {

        System.out.println(convertToRom(2));
    }

    public static Character convertToRom(int arabic) {

        Map<Character, Integer> arabicMap = new HashMap<>();

        arabicMap.put('I', 1);
        arabicMap.put('V', 5);
        arabicMap.put('X', 10);
        arabicMap.put('L', 50);
        arabicMap.put('C', 100);
        arabicMap.put('D', 500);
        arabicMap.put('M', 1000);

        Character result = null;




        return result;
    }

}

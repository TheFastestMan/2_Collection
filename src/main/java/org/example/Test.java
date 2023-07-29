package org.example;


import java.util.HashMap;
import java.util.Map;

public class Test {
    public static String convertToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number out of range (1 - 3999)");
        }
       EqHs eqHs = new EqHs();
        eqHs.hashCode();

        StringBuilder romanNumeral = new StringBuilder();
        Map<Integer, String> romanMap = createRomanMap();

        int[] arabicValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < arabicValues.length; i++) {
            while (number >= arabicValues[i]) {
                romanNumeral.append(romanSymbols[i]);
                number -= arabicValues[i];
            }
        }

        return romanNumeral.toString();
    }

    private static Map<Integer, String> createRomanMap() {
        Map<Integer, String> romanMap = new HashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
        return romanMap;
    }

    public static void main(String[] args) {
        int number = 9;
        String romanNumeral = convertToRoman(number);
        System.out.println("The Roman numeral representation of " + number + " is: " + romanNumeral);
    }
}

package org.example.map.mapTask2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = scanner.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Result: ");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


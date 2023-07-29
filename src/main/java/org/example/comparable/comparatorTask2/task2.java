package org.example.comparable.comparatorTask2;

import java.util.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "two", 2,
                "five", 5,
                "three", 3,
                "one", 1,
                "four", 4
        );
        System.out.println(nonSortedMap);

        System.out.println("-----------------------------------------------");

        System.out.println(sortByValue(nonSortedMap));
    }

    public static LinkedHashMap<String, Integer> sortByValue(Map<String, Integer> map) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        return sortedMap;
    }

}

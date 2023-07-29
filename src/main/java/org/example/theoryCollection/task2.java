package org.example.theoryCollection;

import java.util.*;

public class task2 {
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arrList.add(random.nextInt(100));
        }
        System.out.println(arrList);

        Set<Integer> arrSet = new HashSet<>(arrList);

        System.out.println(arrSet);


    }
}

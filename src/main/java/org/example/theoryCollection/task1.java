package org.example.theoryCollection;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        List<Integer> studentGrades = new ArrayList<>();

        fillRandomNum(studentGrades, 30);

        removeFailingGrades(studentGrades);

        int highestGrade = findHighestGrade(studentGrades);

        System.out.println(highestGrade);


    }

    public static void fillRandomNum(List<Integer> list, int amountOfGrades) {
        Random random = new Random();
        for (int i = 0; i < amountOfGrades; i++) {
            int min = 2;
            int max = 6;
            list.add(random.nextInt(max - min) + min);
        }
    }

    private static void removeFailingGrades(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            if (iter.next() == 2) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

    private static int findHighestGrade(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();

        int highestGrade = 3;

        while (iter.hasNext()) {
            int grades = iter.next();
            if (grades > highestGrade) {
                highestGrade = grades;
            }
        }
        return highestGrade;
    }

}

package org.example.theoryCollection;

import java.util.*;

public class task0 {
    public static void main(String[] args) {

        List<Integer> arrList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            arrList.add(random.nextInt(20)); // передаем в параметр метод для выбора рандомных чисел в диапазоне от 0 до 20
        }

        Iterator <Integer> iterator = arrList.iterator();
        while (iterator.hasNext()){
            if (iterator.next() % 2 == 0){
                iterator.remove();
            }
        }

        TreeSet<Integer> treeList = new TreeSet<>(arrList); // удаляет повторяющиеся числа и сортирует их по возрастанию

        System.out.println(treeList);


    }
}

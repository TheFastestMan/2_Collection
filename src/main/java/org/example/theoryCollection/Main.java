package org.example.theoryCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ////List
        System.out.println("LIST");

        List<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        System.out.println("the first is : " + words.get(0));
        words.remove(0);
        System.out.println("the first is : " + words.get(0));

        System.out.println("---------------------------------");

        ///Set
        System.out.println("SET");

        List<String> treeWords = new ArrayList<>();
        treeWords.add("D");
        treeWords.add("C");
        treeWords.add("B");
        treeWords.add("A");
        System.out.println("ArrayList : " + treeWords);

        Set<String> wordsTree = new TreeSet<>(treeWords);
        System.out.println("TreeSet : " + wordsTree);

        System.out.println("---------------------------------");

        //Queue
        System.out.println("QUEUE");
        
        Queue<String> queue = new LinkedList<>();
        queue.add("element1");
        queue.add("element2");
        queue.add("element3");
        System.out.println("Queue : " + queue.peek());
        System.out.println("Queue : " + queue);
        System.out.println("Queue : " + queue.poll());
        System.out.println("Queue : " + queue);

        System.out.println("---------------------------------");

        //Iterator
        System.out.println("ITERATOR");

        Set<String> iterWords = new HashSet<>();
        iterWords.add("A");
        iterWords.add("D");
        iterWords.add("B");
        iterWords.add("C");

        Iterator<String> iterator = iterWords.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator : " + iterator.next());
        }
    }
}

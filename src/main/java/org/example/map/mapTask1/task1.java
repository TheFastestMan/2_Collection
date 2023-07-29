package org.example.map.mapTask1;


import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {

        Toy toy1 = new Toy("Bear", 0, 1000);
        Toy toy2 = new Toy("Chess", 10, 700);
        Toy toy3 = new Toy("Train", 7, 5000);

        HashMap<String, Toy> toys = new HashMap<>();

        toys.put(toy1.getName(), toy1);
        toys.put(toy2.getName(), toy2);
        toys.put(toy3.getName(), toy3);

        for (Map.Entry<String, Toy> entry : toys.entrySet()) {
            String name = entry.getKey();
            Toy toy = entry.getValue();
            System.out.println("Toy: " + name + ", Age: " + toy.getForAge() + ", Price: " + toy.getPrice());
        }
        System.out.println("---------------------------------");

        for (String name : toys.keySet()) {
            System.out.println("Toy: " + name);
        }
        System.out.println("---------------------------------");

        for (Toy toy : toys.values()) {
            System.out.println("For age: " + toy.getForAge() + "+ y.o. " + ", Price: " + toy.getPrice() + " Rub");
        }


    }

}




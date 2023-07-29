package org.example;

public class Toy {

    private String name;

    private int age;

    public Toy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

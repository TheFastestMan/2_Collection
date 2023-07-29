package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test2 {

    public static void main(String[] args) {
        Test2 test1 = new Test2("test1");
        Test2 test2 = new Test2("test1");

        Map<Test2, Integer> map = new HashMap<>();

        map.put(test1, 1);

        System.out.println(test1.equals(test2));
        System.out.println(map.containsKey(test2));
    }

   private String a;

    public Test2(String a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Test2 test2)) return false;
//        return Objects.equals(a, test2.a);
//    }
}

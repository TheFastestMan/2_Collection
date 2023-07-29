package org.example.comparable.copparatorTask0;

import java.util.*;

public class task0 {
    public static void main(String[] args) {

        User user1 = new User("Boris", 52);
        User user2 = new User("Andrey", 33);
        User user3 = new User("Dave", 42);
        User user4 = new User("Colt", 22);

        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println(userList);

        UserNameComparator userNameComparator = new UserNameComparator();
        UserAgeComparator userAgeComparator = new UserAgeComparator();

        userList.sort(userAgeComparator.thenComparing(userNameComparator));


        System.out.println(userList);


    }

}

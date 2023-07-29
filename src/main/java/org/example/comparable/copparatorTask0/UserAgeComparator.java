package org.example.comparable.copparatorTask0;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User age1, User age2) {
        if (age1.getAge() > age2.getAge()){
            return 1;
        }
        if (age1.getAge() < age2.getAge()){
            return -1;
        }
        return 0;
    }
}

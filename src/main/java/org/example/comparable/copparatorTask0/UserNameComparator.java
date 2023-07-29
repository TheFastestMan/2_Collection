package org.example.comparable.copparatorTask0;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {
    @Override
    public int compare(User name1, User name2) {
        return name1.getName().compareTo(name2.getName());
    }
}

package org.example.hashCode;

import java.util.Comparator;

public class UserDateComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        if (user1.getCreatedDate().isAfter(user2.getCreatedDate())) {
            return 1;
        } else if (user2.getCreatedDate().isAfter(user1.getCreatedDate())) {
            return -1;
        } else
            return 0;
    }

}

package org.example.hashCode;

import java.util.*;

public class Manager {
    private static Map<String, User> userMap = new HashMap<>();

    public boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("There is no user");
            return false;
        } else if (userMap.get(login).getPassword().equals(password)) {
            System.out.println("You successfully login");
            return true;
        } else
            return false;
    }

    public boolean addNewUser(User user) {
        if (userMap.containsKey(user.getLogin())) {
            System.out.println("User has already existed!");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println(user.getLogin() + "User successfully has been added");
            return true;
        }
    }

    public boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("User has been removed");
            return true;
        } else
            return false;
    }

    public void getAllUsers() {
        System.out.println(userMap.keySet());
    }

    public void getAllUsers(String sortCriterion) {
        switch (sortCriterion) {
            case "login":
                Map<String, User> sortedByLoginMap = new TreeMap<>(userMap);
                for (Map.Entry entry : sortedByLoginMap.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
                break;
            case "date":
                UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sortedDateList = new ArrayList<>(userMap.values());
                sortedDateList.sort(userDateComparator);
                for (User user : sortedDateList) {
                    System.out.println(user);
                }
                break;
        }
    }

    public boolean editUser(User user) {
        if (!userMap.containsKey(user.getLogin())) {
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            return true;
        }
    }

}

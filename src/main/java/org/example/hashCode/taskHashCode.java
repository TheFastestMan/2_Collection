package org.example.hashCode;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class taskHashCode {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.addNewUser(new User("1","1", LocalDate.now()));
        manager.addNewUser(new User("2","2", LocalDate.now()));
        manager.addNewUser(new User("3","3", LocalDate.now()));

        manager.getAllUsers("date");

        manager.login("1", "1");

        manager.editUser(new User("5","5", LocalDate.now()));

    }

}

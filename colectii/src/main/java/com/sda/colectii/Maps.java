package com.sda.colectii;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
//        String = keys | Users = values
        Map<String, User> utilizatori = new HashMap<>();

        User gigel = new User("Gigel200xxx", "gigel@google.com", "asd");
        User dorel = new User("ladiesman69", "dorel_1@yahoo.co.uk", "ammere");
        User mircica = new User("BenDover", "gigel@google.com", "asd");

        setPairInMap(utilizatori, gigel);
        setPairInMap(utilizatori, dorel);
        setPairInMap(utilizatori, mircica);

        printMap(utilizatori);
    }

    private static void setPairInMap(Map<String, User> userMap, User user) {
        if (userMap.containsKey(user.getEmail())) {
            System.out.println("Key already exists. Will not save");
        } else {
            userMap.put(user.getEmail(), user);
        }
    }

    private static void printMap(Map<String, User> utilizatori) {
        for (String key : utilizatori.keySet()) {
            System.out.println(key + " " + utilizatori.get(key));
        }
    }

}

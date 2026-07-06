package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1,"João"));
        users.add(new User(2,"Maria "));
        users.add(new User(3,"Juca"));
        users.add(new User(4,"Leo"));


        System.out.println(new User(1,"João").hashCode());
        System.out.println(users.contains(new User(1,"João")));
        ;

        System.out.println(users);

    }
}

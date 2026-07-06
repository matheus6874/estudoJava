package org.example.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<User> users = new ArrayList<>();
      var user = new User(1,"Matheus");
      users.add(user);
      System.out.println(users.contains(user));
      System.out.println(users.getLast());
      System.out.println(users.getFirst());
    }
}

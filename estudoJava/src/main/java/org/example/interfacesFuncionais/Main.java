package org.example.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> usuarios =  List.of(new User("Maria",21),new User("Matheus",40),
                new User("Ana",19));
        printStringValue(user -> String.valueOf(user.age()),usuarios);
        }

        private static void printStringValue(Function<User, String> callback, List<User> usuarios) {
        usuarios.forEach(u -> System.out.println(callback.apply(u)));
    }
}

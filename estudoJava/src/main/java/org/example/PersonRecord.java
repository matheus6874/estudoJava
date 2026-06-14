package org.example;

public record PersonRecord(String name, int age) {
    public PersonRecord{
        System.out.println(name);
        System.out.println(age);
    }
}

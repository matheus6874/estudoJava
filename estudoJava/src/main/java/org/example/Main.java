package org.example;

public class Main {
    public static void main(String[] args) {
       var male = new Person("Matheus");
       var female = new Person("Maria");
       var maleRecord = new PersonRecord("Matheus",20);

        male.incAge();
        male.incAge();
        male.incAge();
        System.out.println("Male name " + male.getName());
        System.out.println("Male age " + male.getAge());
        System.out.println("Female  " + female.getName());
        System.out.println("Female age " + female.getAge());


        System.out.println(maleRecord.age());
        System.out.println(maleRecord.name());


    }
}
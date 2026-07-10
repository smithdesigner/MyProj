package com.se450.project;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main (String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Robin");
        animals.add("Poodle");
        animals.add("Cardinal");
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);
    }
}

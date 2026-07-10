package com.se450.project;
import java.util.ArrayList;

public class ArrayListDemo {

    public static int sizeOfList(ArrayList<String> pets, int value) {
        pets.remove(value);
        return pets.size();
    }

    public static void main (String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Robin");
        animals.add("Poodle");
        animals.add("Cardinal");
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);
        System.out.println(sizeOfList(animals, 0));
    }
}

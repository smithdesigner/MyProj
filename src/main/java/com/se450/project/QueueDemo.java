package com.se450.project;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main (String[] args) {
        Queue<Integer> processList = new LinkedList<>();
        processList.add(1);
        processList.add(2);
        processList.add(3);
        processList.add(4);
        System.out.println(processList);
        processList.remove();
        System.out.println(processList);
    }
}

package com.se450.project;
import java.util.HashMap;

public class HashMapDemo {

    public static void main (String[] args) {
        //maps pid to size of process
        HashMap<Integer, Double> processes = new HashMap<>();
        int pid1 = 1;
        int pid2 = 2;
        double size1 = 234.12;
        double size2 = 33445.34;
        processes.put(pid1, size1);
        processes.put(pid2, size2);
        System.out.println(processes);
        if (processes.containsKey(pid1)) {
            System.out.printf("Pid %d exists.", pid1);
        }
    }
}

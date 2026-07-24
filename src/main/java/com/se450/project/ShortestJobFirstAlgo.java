package com.se450.project;

import java.util.ArrayList;

// implementation of Strategy design pattern
public class ShortestJobFirstAlgo implements ISchedulingAlgorithm {
    @Override
    public void schedule(ArrayList<Process> processes) {
        //using Bubble Sort, will update later to use algorithm with better time complexity
        for (int i = 0; i < processes.size(); i++) {
            for (int j = i + 1; j < processes.size(); j++) {
                if (processes.get(i).burstTime > processes.get(j).burstTime) {
                    Process temp = processes.get(i);
                    processes.set(i, processes.get(j));
                    processes.set(j, temp);
                }
            }
        }
    }
}

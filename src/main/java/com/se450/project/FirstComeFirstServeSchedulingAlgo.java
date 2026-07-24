package com.se450.project;
import java.util.ArrayList;

// implementation of Strategy design pattern
public class FirstComeFirstServeSchedulingAlgo implements ISchedulingAlgorithm {
    @Override
    public void schedule(ArrayList<Process> processes) {
        processes.sort((p1, p2) -> p1.arrivalTime - p2.arrivalTime);
    }
}

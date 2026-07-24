package com.se450.project;

import java.util.ArrayList;

// implementation of Strategy design pattern
public interface ISchedulingAlgorithm {
    void schedule(ArrayList<Process> processes);
}

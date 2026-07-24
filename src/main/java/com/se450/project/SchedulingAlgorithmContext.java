package com.se450.project;

import java.util.ArrayList;

// implementation of Strategy design pattern
public class SchedulingAlgorithmContext {
    public ISchedulingAlgorithm schedulingAlgorithm;

    public void setISchedulingAlgorithm (ISchedulingAlgorithm schedulingAlgorithm) {
        this.schedulingAlgorithm = schedulingAlgorithm;
    }

    public void executeSchedulingAlgorithm(ArrayList<Process> processes) {
        schedulingAlgorithm.schedule(processes);
    }
}

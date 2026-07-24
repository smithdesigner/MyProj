package com.se450.project;

// implementation of State design pattern
public class Process {
    // context
    IProcessState state;
    public int arrivalTime;
    public int burstTime;
    public int pid;

    public Process() {
        this.state = new ReadyState(); //why is it this state? I thought it doesn't get placed on run queue until in ready state?
    }

    public void changeState(IProcessState newState) {
        state = newState;
    }

    public void dispatch(Process p) {
        state.dispatch(p);
    }

    public void block(Process p) {
        state.block(p);
    }

    public void unblock(Process p) {
        state.unblock(p);
    }

    public void preempt(Process p) {
        state.preempt(p);
    }

    public void terminate(Process p) {
        state.terminate(p);
    }
}

package com.se450.project;

// implementation of State design pattern
public class RunningState implements IProcessState {
    // concrete class
    @Override
    public void dispatch(Process p) {
        System.out.println("Error: Process is already running.");
    }

    @Override
    public void block(Process p) {
        p.changeState(new WaitingState());
        System.out.println("Process now in waiting state.");
    }

    @Override
    public void unblock(Process p) {
        System.out.println("Error: Process is already running.");
    }

    @Override
    public void preempt(Process p) {
        p.changeState(new ReadyState());
        System.out.println("Process now in ready state.");
    }

    @Override
    public void terminate(Process p) {
        p.changeState(new TerminatedState());
        System.out.println("Process now terminated.");
    }
}

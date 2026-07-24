package com.se450.project;

// implementation of State design pattern
public class ReadyState implements IProcessState {
    // concrete class
    @Override
    public void dispatch(Process p) {
        p.changeState(new RunningState());
    }

    @Override
    public void block(Process p) {
        System.out.println("Error: Process already in ready state.");
    }

    @Override
    public void unblock(Process p) {
        System.out.println("Error: Process already in ready state.");
    }

    @Override
    public void preempt(Process p) {
        System.out.println("Error: Process already in ready state.");
    }

    @Override
    public void terminate(Process p) {
        p.changeState(new TerminatedState());
        System.out.println("Process now terminated.");
    }
}

package com.se450.project;

// implementation of State design pattern
public class TerminatedState implements IProcessState {
    // concrete class
    @Override
    public void dispatch(Process p) {
        System.out.println("Error: Process already terminated.");
    }

    @Override
    public void block(Process p) {
        System.out.println("Error: Process already terminated.");
    }

    @Override
    public void unblock(Process p) {
        System.out.println("Error: Process already terminated.");
    }

    @Override
    public void preempt(Process p) {
        System.out.println("Error: Process already terminated.");
    }

    @Override
    public void terminate(Process p) {
        System.out.println("Error: Process already terminated.");
    }
}

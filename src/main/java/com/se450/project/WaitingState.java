package com.se450.project;

// implementation of State design pattern
public class WaitingState implements IProcessState{
    // concrete class
    @Override
    public void dispatch(Process p) {
        System.out.println("Error: Process in waiting state.");
    }

    @Override
    public void block(Process p) {
        System.out.println("Error: Process in waiting state.");
    }

    @Override
    public void unblock(Process p) {
        p.changeState(new ReadyState());
    }

    @Override
    public void preempt(Process p) {
        System.out.println("Error: Process in waiting state.");
    }

    @Override
    public void terminate(Process p) {
        System.out.println("Error: Process in waiting state.");
    }
}

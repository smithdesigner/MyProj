package com.se450.project;

// implementation of State design pattern
public interface IProcessState {
    // abstract state
    void dispatch(Process p);   // scheduler tries to run this process (Ready -> Running)
    void block(Process p);      // process issues I/O/blocking request (Running -> Waiting)
    void unblock(Process p);     // blocking request completes (Waiting -> Ready)
    void preempt(Process p);    // timer interrupt expires (Running -> Ready)
    void terminate(Process p);  // process finishes or aborts (-> Terminated)
}

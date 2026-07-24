package com.se450.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessTest {

    @Test
    public void testValidProcessFieldsAfterCreation() {
        Process process = new Process();
        process.arrivalTime = 5;
        process.burstTime = 10;
        process.pid = 123;

        assertEquals(5, process.arrivalTime);
        assertEquals(10, process.burstTime);
        assertEquals(123, process.pid);
    }

    @Test
    public void testNewProcessStartsInReadyState() {
        Process process = new Process();
        assertInstanceOf(ReadyState.class, process.state);
    }

    @Test
    public void testChangeStateUpdatesToNewState() {
        Process process = new Process();
        process.changeState(new RunningState());
        assertInstanceOf(RunningState.class, process.state);
    }

    @Test
    public void testDispatchUpdatesToNewState() {
        Process process = new Process();
        process.dispatch(process);
        assertInstanceOf(RunningState.class, process.state);
    }

    @Test
    public void testBlockDoesNotTransitionToNewState() {
        Process process = new Process();
        process.block(process);
        assertInstanceOf(ReadyState.class, process.state);
    }

    @Test
    public void testUnblockDoesNotTransitionToNewState() {
        Process process = new Process();
        process.unblock(process);
        assertInstanceOf(ReadyState.class, process.state);
    }

    @Test
    public void testPreemptDoesNotTransitionToNewState() {
        Process process = new Process();
        process.preempt(process);
        assertInstanceOf(ReadyState.class, process.state);
    }

    @Test
    public void testTerminateUpdatesToNewState() {
        Process process = new Process();
        process.terminate(process);
        assertInstanceOf(TerminatedState.class, process.state);
    }
}

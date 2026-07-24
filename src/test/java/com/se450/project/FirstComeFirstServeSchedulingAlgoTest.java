package com.se450.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FirstComeFirstServeSchedulingAlgoTest {

    @Test
    public void testValidFCFSAlgoSortAfterCreation() {
        FirstComeFirstServeSchedulingAlgo scheduler = new FirstComeFirstServeSchedulingAlgo();

        Process p1 = new Process();
        p1.pid = 1;
        p1.arrivalTime = 10;

        Process p2 = new Process();
        p2.pid = 2;
        p2.arrivalTime = 2;

        Process p3 = new Process();
        p3.pid = 3;
        p3.arrivalTime = 5;

        ArrayList<Process> processes = new ArrayList<>();
        processes.add(p1);
        processes.add(p2);
        processes.add(p3);

        scheduler.schedule(processes);

        assertEquals(p2, processes.get(0));
        assertEquals(p3, processes.get(1));
        assertEquals(p1, processes.get(2));
    }
}

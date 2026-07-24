package com.se450.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ShortestJobFirstAlgoTest {

    @Test
    public void testValidSJFSchedulesInAscendingOrder() {
        ShortestJobFirstAlgo scheduler = new ShortestJobFirstAlgo();

        Process p1 = new Process();
        p1.pid = 1;
        p1.burstTime = 12; // Longest job

        Process p2 = new Process();
        p2.pid = 2;
        p2.burstTime = 3;  // Shortest job

        Process p3 = new Process();
        p3.pid = 3;
        p3.burstTime = 7;  // Medium job

        ArrayList<Process> processes = new ArrayList<>();
        processes.add(p1);
        processes.add(p2);
        processes.add(p3);

        scheduler.schedule(processes);

        assertEquals(p2, processes.get(0), "Order should be p2 (3) -> p3 (7) -> p1 (12)");
        assertEquals(p3, processes.get(1), "Order should be p2 (3) -> p3 (7) -> p1 (12)");
        assertEquals(p1, processes.get(2), "Order should be p2 (3) -> p3 (7) -> p1 (12)");
    }
}

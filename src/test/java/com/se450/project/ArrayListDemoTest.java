package com.se450.project;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListDemoTest {

    @Test
    void sizeOfListRemovesIndexAndReturnsCorrectValue() {
        ArrayList<String> testPets = new ArrayList<>();
        testPets.add("Robin");
        testPets.add("Poodle");

        int result = ArrayListDemo.sizeOfList(testPets, 0);

        assertEquals(1, result);
    }


}

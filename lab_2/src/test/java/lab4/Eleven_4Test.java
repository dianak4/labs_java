// Eleven_4Test.java
package lab4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Eleven_4Test {

    @Test
    void testViewElements() {
        Eleven_4 program = new Eleven_4();
        Set<Integer> elements = program.viewElements();
        assertEquals(10, elements.size(), "Initial set should contain 10 unique elements.");
    }

    @Test
    void testAddElement() {
        Eleven_4 program = new Eleven_4();
        int newElement = 101; // Assuming it's outside the random [0, 99] range
        boolean isAdded = program.addElement(newElement);
        assertTrue(isAdded, "Element should be added successfully.");
        assertTrue(program.viewElements().contains(newElement), "Set should contain the newly added element.");
    }

    @Test
    void testAddDuplicateElement() {
        Eleven_4 program = new Eleven_4();
        Set<Integer> elements = program.viewElements();
        int existingElement = elements.iterator().next();
        boolean isAdded = program.addElement(existingElement);
        assertFalse(isAdded, "Duplicate element should not be added.");
    }

    @Test
    void testRemoveElement() {
        Eleven_4 program = new Eleven_4();
        Set<Integer> elements = program.viewElements();
        int existingElement = elements.iterator().next();
        boolean isRemoved = program.removeElement(existingElement);
        assertTrue(isRemoved, "Existing element should be removed successfully.");
        assertFalse(program.viewElements().contains(existingElement), "Set should not contain the removed element.");
    }

    @Test
    void testRemoveNonexistentElement() {
        Eleven_4 program = new Eleven_4();
        boolean isRemoved = program.removeElement(999); // A number unlikely to be in the set
        assertFalse(isRemoved, "Nonexistent element should not be removed.");
    }

    @Test
    void testGetSortedElements() {
        Eleven_4 program = new Eleven_4();
        List<Integer> sortedElements = program.getSortedElements();
        assertEquals(sortedElements.size(), program.viewElements().size(), "Sorted list should match the size of the set.");
        for (int i = 1; i < sortedElements.size(); i++) {
            assertTrue(sortedElements.get(i) >= sortedElements.get(i - 1), "List should be sorted in ascending order.");
        }
    }
}

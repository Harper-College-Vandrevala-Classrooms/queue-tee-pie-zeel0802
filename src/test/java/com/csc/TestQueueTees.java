package com.csc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueueTees {

    // Test the capacity-based constructor
    @Test
    public void testQueueCapacity() {
        QueueTees queue = new QueueTees(3);

        queue.enqueue("Cutie");
        queue.enqueue("Kitty");
        queue.enqueue("Puppy");

        // Test that adding more than capacity throws exception
        assertThrows(IllegalStateException.class, () -> queue.enqueue("PygmyMarmoset"));

        assertEquals("Cutie", queue.dequeue());
        assertEquals(2, queue.getSize());
    }

    // Test Priority Queue
    @Test
    public void testPriorityQueue() {
        PriorityQueueTees priorityQueue = new PriorityQueueTees();

        priorityQueue.enqueue("Puppy");
        priorityQueue.enqueue("Cutie");
        priorityQueue.enqueue("Kitty");

        assertEquals("Cutie", priorityQueue.dequeue()); // Alphabetical order
        assertEquals("Kitty", priorityQueue.dequeue());
        assertEquals("Puppy", priorityQueue.dequeue());

        assertTrue(priorityQueue.isEmpty());
    }
}

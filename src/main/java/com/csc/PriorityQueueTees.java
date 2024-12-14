package com.csc;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PriorityQueueTees {
    private PriorityQueue<Object> priorityQueue;

    public PriorityQueueTees() {
        priorityQueue = new PriorityQueue<>();
    }

    // Enqueue an element
    public void enqueue(Object element) {
        priorityQueue.add(element);
    }

    // Dequeue the element with the highest priority
    public Object dequeue() {
        if (priorityQueue.isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty!");
        }
        return priorityQueue.poll();
    }

    // Peek at the element with the highest priority
    public Object peek() {
        if (priorityQueue.isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty!");
        }
        return priorityQueue.peek();
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    // Print the elements in the priority queue
    public void printQueue() {
        System.out.println("Priority Queue: " + priorityQueue);
    }
}

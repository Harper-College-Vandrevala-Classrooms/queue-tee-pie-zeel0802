package com.csc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTees {
    private Queue<Object> queue;
    private int capacity; // Optional capacity limit

    // No-argument constructor
    public QueueTees() {
        queue = new LinkedList<>();
        capacity = Integer.MAX_VALUE; // Default to unlimited
    }

    // Constructor with capacity
    public QueueTees(int capacity) {
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    // Enqueue an element (with capacity check)
    public void enqueue(Object item) {
        if (queue.size() >= capacity) {
            throw new IllegalStateException("Queue is full!");
        }
        queue.add(item);
    }

    // Dequeue an element
    public Object dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return queue.poll();
    }

    // Peek at the front of the queue
    public Object peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return queue.peek();
    }

    // Get the size of the queue
    public int getSize() {
        return queue.size();
    }

    // Reverse the queue
    public void reverseQueue() {
        LinkedList<Object> stack = new LinkedList<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // Check if an element exists in the queue
    public boolean contains(Object item) {
        return queue.contains(item);
    }

    // Print all elements in the queue
    public void printQueue() {
        System.out.println("Queue: " + queue);
    }
}

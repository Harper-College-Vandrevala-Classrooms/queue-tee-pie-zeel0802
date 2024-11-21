package com.csc;

public class QueueTees {
    private Cutie[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public QueueTees(int capacity) {
        this.capacity = capacity;
        this.queue = new Cutie[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Enqueue method
    public void enqueue(Cutie cutie) {
        if (size == capacity) {
            System.out.println("Queue is full! Cannot add more cuties.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = cutie;
        size++;
        System.out.println("Added: " + cutie.description());
    }

    // Dequeue method
    public Cutie dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return null;
        }
        Cutie dequeued = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Removed: " + dequeued.description());
        return dequeued;
    }

    // Size method
    public int size() {
        return size;
    }

    // Clear method
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue has been cleared.");
    }
}

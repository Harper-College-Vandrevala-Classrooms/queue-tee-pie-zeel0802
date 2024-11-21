package com.csc;

public class TestQueueTees {
    public static void main(String[] args) {
        // Create a queue with capacity of 5
        QueueTees queue = new QueueTees(5);

        // Create Cutie objects
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        // Enqueue objects
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        // Display queue size
        System.out.println("Queue size: " + queue.size());

        // Dequeue objects
        queue.dequeue();
        queue.dequeue();

        // Display queue size
        System.out.println("Queue size after dequeues: " + queue.size());

        // Clear the queue
        queue.clear();
        System.out.println("Queue size after clearing: " + queue.size());
    }
}

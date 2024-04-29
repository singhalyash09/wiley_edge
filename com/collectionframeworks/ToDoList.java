package com.collectionframeworks;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Task{
    String duration;
    int deadline;
    boolean status=false;
    String name;

    public Task(String name, int deadline) {
        this.name = name;
        this.deadline = deadline;
    }


}

public class ToDoList {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        Task task1 = new Task("Cleaning", 29);
        Task task2 = new Task("Car Washing",15);
        System.out.println(queue);


//        Queue<String> queue = new LinkedList<>();
//        queue.add("Hello");
//        queue.add("World");
//
//        System.out.println(queue);

    }

}

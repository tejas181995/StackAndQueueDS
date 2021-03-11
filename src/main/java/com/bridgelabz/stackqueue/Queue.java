package com.bridgelabz.stackqueue;

public class Queue<T extends Comparable <T>> {
    LinkedList<T> queue;

    public Queue(){
        queue = new LinkedList<>();
    }
    public void push(T data){
        queue.pushFront(data);
    }
    public T pop(){
        return queue.popLast();
    }
}

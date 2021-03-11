package com.bridgelabz.stackqueue;

public class Stack<T extends Comparable <T>> {
    LinkedList<T> stack;
    public Stack() {
        stack = new LinkedList<>();
    }

    public void push (T data){
      stack.pushFront(data);
    }
    public T pop(){
        return stack.pop();
    }
    public T top(){
        return stack.getHead();
    }


}

package com.bridgelabz.stackqueue;

public class LinkedList<T extends Comparable <T>> {

    Node<T> head;
    int count;
    public LinkedList(T data) {
        head = new Node(data);
        count = 1;
    }
    public LinkedList(){
        this.head = null;
        count = 0;
    }
    public T getHead(){
        return head.data;
    }
    public int getCount(){
        return count;
    }
    public void pushBack(T next){
        Node<T> temp = head;
        while(temp.hasNext())
            temp = temp.next();
        temp.link = new Node<>(next);
        count++;
    }
    public void pushFront(T next){
        Node<T> newNode = new Node<>(next);
        newNode.link = head;
        head = newNode;
        count++;
    }
    public void printList(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next();
        }

    }
    public void insert(int postion, T data){
        Node<T> temp = head;
        if(postion == 0){
            pushFront(data);
        }else {
            for(int i=0; i<postion - 1; i++){
                temp = temp.next();

            }
            Node<T> newnode = new Node(data);
            newnode.link = temp.next();
            temp.link = newnode;
        }
        count++;
    }
    public T pop(){
        T val = head.data;
        head = head.next() ;
        count--;
        return val;

    }
    public T popLast(){
        Node<T> secondLast = head;
        Node<T> last = head;
        while(last.hasNext()){
            secondLast = last;
            last = last.next();
        }
        secondLast.link = null;
        count--;
        return last.data;

    }
    public int indexOf(T data){
        Node<T> temp = head;
        int i = 0;
        while(temp != null){
            if(data == temp.data){
                return i;
            }
            temp = temp.next();
            i++;
        }
        return -1;
    }
    public void remove(T data){
        Node<T> secondLast = head;
        Node<T> last = head;
        while(last.data != data){
            secondLast = last;
            last = last.next();
        }
        if(last != null && last.data == data){
            secondLast.link = last.link;
            count--;

        }
    }
    public void insertInOrder(T data){
        Node<T> temp = head;
        for(int i=0; i<count; i++){
            if(temp.data.compareTo(data) > 0){
                insert(i, data);
                return;
            }
        }
        pushBack(data);
    }
    public boolean isEmpty(){
        return head != null;
    }

}
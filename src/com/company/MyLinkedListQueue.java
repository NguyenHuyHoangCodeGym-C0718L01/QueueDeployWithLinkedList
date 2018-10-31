package com.company;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            System.out.println("Enqueue operation is done ! "+key+" is first element of queue");
            return;
        }
        this.tail.setNext(temp);
        this.tail = temp;
        System.out.println("Enqueue operation is done ! "+key+" just push to queue");
    }

    public Node dequeue(){
        if(this.head == null){
            System.out.println("Enqueue operation is done ! Nothing in queue");
            return null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        if(this.head == null){
            this.tail = null;
        }
        System.out.println("Dequeue operation is done ! "+temp.getKey()+" just remove from queue");
        return temp;
    }
}

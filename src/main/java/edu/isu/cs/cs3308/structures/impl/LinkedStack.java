package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Stack;

public class LinkedStack<E> implements Stack<E> {

    DoublyLinkedList<E> data;

    public LinkedStack() { data = new DoublyLinkedList<>(); }

    @Override
    public void push(E element) {
        data.addFirst(element);
    }

    public E peek() {
        return data.get(1);
    }

    public E pop() {
        return data.removeFirst();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void transfer(Stack<E> to){
        if (data.isEmpty()) {}
        else {
            for (int i = 0; i < data.size(); i++) {
                ((LinkedStack<E>)to).push(this.pop());
            }
        }
    }

    public void reverse() {
        LinkedStack<E> temp = new LinkedStack();

        for (int i = 0; i < data.size(); i++) {
            temp.push(this.pop());
        }
        for (int i = 0; i < temp.size(); i++) {
            this.push(temp.pop());
        }

    }

    public void merge(Stack<E> other) {

    }

    public void printStack() {
        data.printList();
    }


}

package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Stack;

public class LinkedStack<E> implements Stack<E> {

    DoublyLinkedList<E> data;

    public LinkedStack() { data = new DoublyLinkedList<>(); }

    @Override
    public void push(E element) { data.addFirst(element); }

    @Override
    public E peek() {
        return data.get(0);
    }

    @Override
    public E pop() { return data.removeFirst(); }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void transfer(Stack<E> to){
        if (this.isEmpty()) {}
        else if (to == null){}
        else {
            for (int i = 0; i < (this.size() + 1); i++) {
                to.push(this.pop());
            }
        }
    }

    @Override
    public void reverse() {
        LinkedStack<E> temp = new LinkedStack();
        LinkedStack<E> temp2 = new LinkedStack();

        for (int i = 0; i < this.size(); i++) {
            temp.push(this.pop());
        }

    }

    @Override
    public void merge(Stack<E> other) {

    }

    @Override
    public void printStack() {
        data.printList();
    }


}

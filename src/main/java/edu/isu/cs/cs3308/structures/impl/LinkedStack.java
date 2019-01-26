package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Stack;

public class LinkedStack<E> implements Stack<E> {

    DoublyLinkedList<E> data;

    public LinkedStack() { data = new DoublyLinkedList<>(); }

    @Override
    public void push(E element) { this.data.addFirst(element); }

    @Override
    public E peek() {
        return this.data.get(0);
    }

    @Override
    public E pop() { return this.data.removeFirst(); }

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
            int loopControl = this.size();
            for (int i = 0; i < loopControl; i++) {
                to.push(this.pop());
            }
        }
    }

    @Override
    public void reverse() {
        LinkedStack<E> temp = new LinkedStack();
        LinkedStack<E> temp2 = new LinkedStack();
        int loopControl = this.size();
        for (int i = 0; i < loopControl; i++) {
            temp.push(this.pop());
        }
        for (int i = 0; i < loopControl; i++) {
            temp2.push(temp.pop());
        }
        for (int i = 0; i < loopControl; i++) {
            this.push(temp2.pop());
        }

    }

    @Override
    public void merge(Stack<E> other) {
        if (this.isEmpty() || other == null) {}
        else {
            LinkedStack<E> temp = new LinkedStack();
            LinkedStack<E> temp2 = new LinkedStack();
            int paramSize = other.size();
            int thisSize = this.size();

            for (int i = 0; i < thisSize; i++){
                temp.push(this.pop());
            }
            for (int i = 0; i < paramSize; i++) {
                temp2.push(other.pop());
            }
            for (int i = 0; i < paramSize; i++) {
                this.push(temp2.peek());
                other.push(temp2.pop());
            }
            for (int i = 0; i < thisSize; i++) {
                this.push(temp.pop());
            }
        }




    }

    @Override
    public void printStack() {
        data.printList();
    }


}

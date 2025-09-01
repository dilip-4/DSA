package com.dilip.dsa.arrays;

public class CustomStack {
    //Explain how you would implement a stack using arrays or linked lists.
    // Can you write a code snippet to push and pop elements?

    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        capacity = size;
        top = -1;
        stack = new int[capacity];
    }
    public void push(int item){
        if(top == capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[top++] = item;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        return stack[top--];
    }
}

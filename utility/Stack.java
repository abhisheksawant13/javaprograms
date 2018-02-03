package com.bridgelabz.utility;

public class Stack<T extends Object> {
 
    private int size;
    private T[] stackArray;
    private int top;
   
    public Stack(int size) {
        this.size = size;
        this.stackArray = (T[]) new Object[size];
        this.top = -1;
    }
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    public boolean isStackFull() {
        return (top == size - 1);
    }
    
    public void push(T data){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Cannot Push into Stack"));
        }
        System.out.println("Adding: "+data);
        this.stackArray[++top] = data;
    }
 
    public T pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        T entry = this.stackArray[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    public T peek() {
        return stackArray[top];
    }
}
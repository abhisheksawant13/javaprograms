package com.bridgelabz.utility;
import java.util.LinkedList;
public class Queue<T> {
  private LinkedList<T> list = new LinkedList<T>();

  public void enqueue(T item) {
    list.addLast(item);
  }

  public T dequeue() {
    return list.poll();
  }

  public boolean hasItems() {
    return !list.isEmpty();
  }

  public int size() {
    return list.size();
  }
  public T front() {
	  return  list.getFirst();
  }
  public T last() {
	  return list.getLast();
  }
  public void addAtFront(T item) {
	  list.addFirst(item);
  }
  
  public void removeAtFront(T item) {
	  list.removeFirst();
  }
}
/* public void addItems(Queue<? extends T> q) {
while (q.hasItems())
  list.addLast(q.dequeue());
}*/
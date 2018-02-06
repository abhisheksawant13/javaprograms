package com.bridgelabz.utility;

public class LinkedList<T>{
	 
    private Node<T> head;
    private Node<T> tail;
    private int size=0;
    @SuppressWarnings("hiding")
	class Node<T> implements Comparable<T> {
        
        private T value;
        private Node<T> nextRef;
		public  Node<T> prev;
         
        public T getValue() {
            return  value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        public Node<T> getNext() {
            return nextRef;
        }
        public void setNext(Node<T> reference) {
            this.nextRef = reference;
        }
		@Override//to avoid abstraction
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			return 0;
		}
    }
    public void add(T element){
         
        Node<T> node = new Node<T>();
        node.setValue(element);
        //System.out.println("Adding: "+element);
       	//check if the list is empty
        if(head == null){
            head = node;
            tail = node;
        } else {
            //set current tail next link to new node
            tail.setNext(node);
            //set tail as newly created node
            tail = node;
        }
        size++;
    }
     
    public void addAfter(T element, T after){
         
        Node<T> temp = head;
        Node<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while(true){
            if(temp == null){
                break;
            }
            if(temp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = temp;
                break;
            }
            temp = temp.getNext();
        }
        if(refNode != null){
            //add element after the target node
            Node<T> nd = new Node<T>();
            nd.setValue(element);
            nd.setNext(temp.getNext());
            if(temp == tail){
                tail = nd;
            }
            temp.setNext(nd);
             
        } else {
            System.out.println("Unable to find the given element...");
        }
    }
    
   
    /**
     * @param after
     */
    public void deleteAfter(T after){
         
        Node<T> temp = head;
        Node<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        
        /**
         * Traverse till given element
         */
        while(true){
            if(temp == null){
                break;
            }
            if(temp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = temp;
                break;
            }
            temp = temp.getNext();
        }
        if(refNode != null){
            temp = refNode.getNext();
            refNode.setNext(temp.getNext());
            if(refNode.getNext() == null){
                tail = refNode;
            }
            System.out.println("Deleted: "+temp.getValue());
        } else {
            System.out.println("Unable to find the given element...");
        }
    }
     
    /**
     * @return the size
     */
    public int size() {
		return size;
    }
    
 /**
 * @param data takes the inout data
 * @return true or false if data found/notund
 */
public boolean contains(T data) {
        
        boolean flag=false;
        Node<T>temp = head;
        while(temp!=null) {
            if(temp.value.equals(data)) {
                flag = true;
                break;
            }
            temp=temp.nextRef;
        }
        return flag;
    }
    
    /**
     * @param data
     */
    public void remove(T data) {
        if(head.value.equals(data)) {
            head = head.nextRef;
            size--;
        }
        else {
            Node<T> temp = head;
            Node<T> prev = null;
            while(temp.value!=null) {
                if(temp.value.equals(data)) {
                    prev.nextRef=temp.nextRef;
                    size--;
                    break;
                }
                prev=temp;
                temp = temp.nextRef;
            }
        }
    }
    
    
    /**
     * 
     */
    public void show(){
        
        Node<T> temp = head;
        while(true){
            if(temp == null){
                break;
            }
            System.out.print(" "+temp.getValue());
            temp = temp.getNext();
        }
    }
    
    /**
     * @return
     */
    public int[] returnIntArray() {
    int MyArr[] = new int[size];
    int i=0;
    Node<T> temp=head;
    while(temp!=null) {
        
        MyArr[i++]=(int)temp.value;
        temp=temp.nextRef;
    }
    return MyArr;
    }
    
    /**
     * @return
     */
    public String[] returnCharArray() {
    	String stringArray[] = new String[size];
    	int i =0;
    	Node<T> temp=head;
    	while(temp!=null) {
    		stringArray[i++] = temp.value.toString();
    		temp=temp.nextRef;
    	}
    	return stringArray;
    	}
    
    //Deletes the front 
    /**
     * 
     */
    public void delete(){
         
        if(head == null){
            System.out.println("Underflow...");
        }
        Node<T> temp = head;
        head = temp.getNext();
        if(head == null){
            tail = null;
        }
        size--;
        System.out.println("Deleted: "+temp.getValue());
    }
}
   /* public T deleteATLast() {
    	if(head==null)
    		return null;
    	Node<T> temp1 =head;
    		if(temp1.nextRef.nextRef==null) {
    			temp1.nextRef = null;
    		}*/
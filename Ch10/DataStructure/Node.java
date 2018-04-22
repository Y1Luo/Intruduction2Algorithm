package com.ITA.Ch10.DataStructure;

public class Node {

	private Node prev;
	private Node next;
	private double key;
	
	public Node(double x){
		this.setKey(x);
		this.setPrev(null);
		this.setNext(null);
	}

	public Node(){
		this.setPrev(null);
		this.setNext(null);
	}
	
	public Node(int key) {
		this.key=key;
		this.prev=prev;
		this.next=null;
	}
	
	public Node(int key,Node next){
		this.key=key;
		this.next=next;
	}
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}



	public double getKey() {
		return key;
	}



	public void setKey(double key) {
		this.key = key;
	}
	
	
}

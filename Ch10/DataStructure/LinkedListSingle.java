package com.ITA.Ch10.DataStructure;
public class LinkedListSingle {

	
	//global variables
	private Node head;
	private Stack s;
	
	//constructors
	LinkedListSingle(int length){
		head=null;
		s=new Stack(length);
	}
	
	//operations
	public void insert(int x) {
		Node node=new Node(x,null);
		Node p=head;
		
		//when LinkedList is empty
		if(head==null) {
			head=node;
		}
		
		//add to the tail of sequence
		else {
			while(p.getNext()!=null) {
				p=p.getNext();
			}
			p.setNext(node);
		}
	}
	
	public void travese(Node head) {
		Node p=head;
		while(p!=null) {
			System.out.print(p.getKey()+", ");
			p=p.getNext();
		}
		System.out.println();
	}
	
	public Node getHead() {
		return head;
	}
}

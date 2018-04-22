package com.ITA.Ch10.DataStructure;


public class LinkedListDouble {

	//definition of Node
	
	
	
	//global variable
	private Node nil;
	int count;
	
	public LinkedListDouble(){
		nil=new Node();
		nil.setNext(nil);;
		nil.setPrev(nil);;
		count=0;
	}
	
	public int length() {
		return count;
	}
	
	public Node search(int key) {
		Node node=nil.getNext();
		while(node!=null) {
			if(node.getKey()==key) {
				return node;
			}else {
				node=node.getNext();
			}
		}
		System.err.println("can't find the key in the list!");
		return null;
	}
	
	public Node search(Node node) {
		Node temp=nil.getNext();
		while(temp!=null) {
			if(temp==node) {
				return temp;
			}else {
				temp=temp.getNext();
			}
		}
		System.err.println("can't find the key in the list!");
		return null;
	}
	
	public void insertHead(Node node) {
		node.setNext(nil.getNext());
		nil.getNext().setPrev(node);
		nil.setNext(node);
		node.setPrev(nil);
		count++;
	}
	
//	public void insertHead(int key) {
//		Node node=new Node(key);
//		node.setNext(nil.getNext());
//		nil.next.prev=node;
//		nil.next=node;
//		node.prev=nil;
//		count++;
//	}
//	
//	public void listdelete(int key) {
//		Node node=search(key);
//		if(node.prev!=null) {
//			node.prev.next=node.next;
//		}
//		if(node.next!=null) {
//			node.next.prev=node.prev;
//		}
//	}
//	
//	public void listdelete(Node node) {
//		Node temp=search(node);
//		if(temp.prev!=null) {
//			temp.prev.next=temp.next;
//		}
//		if(temp.next!=null) {
//			temp.next.prev=temp.prev;
//		}
//	}
//	
//	public void traverse() {
//		Node head=nil.next;
//		while(head!=nil) {
//			System.out.print(head.key+", ");
//			head=head.next;
//		}
//		System.out.println();
//	}
}

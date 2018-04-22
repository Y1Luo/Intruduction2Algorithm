package com.ITA.Ch10.DataStructure;

public class LinkedList {

	int key;
	LinkedList prev;
	LinkedList next;
	public static LinkedList head;
	public static LinkedList tail;
	public static LinkedList nil;
	
	public LinkedList() {
		prev=null;
		next=null;
	}
	
	public LinkedList(int key) {
		this.key=key;
		prev=null;
		next=null;
		head=null;
		tail=null;
		nil=null;
		
	}

	public static LinkedList search(LinkedList linkedList, int key) {
		LinkedList temp=linkedList;
		
		//go forward
		while(temp!=null) {
			if(temp.key==key) {
				return temp;
			}else {
				temp=temp.prev;
			}
		}
		
		//go backward
		temp=linkedList.next;
		while(temp!=null) {
			if(temp.key==key) {
				return temp;
			}else {
				temp=temp.next;
			}
		}
		
		System.out.println("There is no node matching");
		return null;
	}

	public static void insertForward(LinkedList target,LinkedList insert) {
		if(target.prev!=null) {
			target.prev.next=insert;
			insert.prev=target.prev;
		}else {
			insert.prev=null;
		}
		target.prev=insert;
		insert.next=target;
	}
	
	public static void insertBackward(LinkedList target, LinkedList insert) {
		if(target.next!=null) {
			target.next.prev=insert;
			insert.next=target.next;
		}else {
			insert.next=null;
		}
		target.next=insert;
		insert.prev=target;	
	}
	
	public static void delete(LinkedList linkedList) {
		if(linkedList.prev!=null) {
			linkedList.prev.next=linkedList.next;
		}
		if(linkedList.next!=null) {
			linkedList.next.prev=linkedList.prev;
		}
	}

	
	public static LinkedList searchRecurrsive(LinkedList linkedList,int key) {
		if(linkedList.key==key) {
			return linkedList;
		}
		LinkedList left=linkedList;
		LinkedList right=linkedList;

		if(left.prev!=null) {
			left=left.prev;
			return searchRecurrsive(left,key);
		}
		if(right.next!=null) {
			right=right.next;
			return searchRecurrsive(right,key);
		}
		System.out.println("There is no node matching");
		return null;			
	}
	
	public static void printLinkedList(LinkedList linkedList) {
		while(linkedList!=null) {
			System.out.print(linkedList.key+", ");
			linkedList=linkedList.next;
		}
		System.out.println();
	}
}

package com.ITA.Ch18.BTrees;

public class BTree {

	private int t;
	private BHeap root;
	
	public BTree(int t){
		this.t=t;
	}
	
	public void insert(BHeap bHeap){
		if(this.getRoot()==null){
			this.setRoot(bHeap);;
		}
	}

	public int getT() {
		return t;
	}

	public BHeap getRoot() {
		return root;
	}
	
	public void setRoot(BHeap bHeap){
		this.root=bHeap;
	}
		
}

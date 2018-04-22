package com.ITA.Ch12.BinarySearchTree;

public class Heap {
	
	private int parentIndex;
	private int leftIndex;
	private int rightIndex;
	private double key;
	private Heap parent;
	private Heap left;
	private Heap right;
	private String color;
	static Heap nil=null;
	
	/*
	 * constructors
	 */
	//initiate the Heap from the No.i element of an array, array counts from 0
	public Heap(int i){
		this.setParentIndexFromArray(i);
		this.setLeftIndexFromArray(i);
		this.setRightIndexFromArray(i);
	}

	
	//initiate the Heap from the 
	public Heap(double x){
		this.setKey(x);	
		this.setLeft(nil);
		this.setRight(nil);
		this.setParent(nil);
		this.setColor("RED");
	}

	/*
	 * initiate related elements of heap from the same array
	 */
	public void setParentIndexFromArray(int i) {
		this.parentIndex = (i-1)/2;
	}	
	
	public void setLeftIndexFromArray(int i) {
		this.leftIndex = i*2+1;
	}
	
	public void setRightIndexFromArray(int i) {
		this.rightIndex = i*2+2;
	}

	/*
	 * getters and setters
	 */
	public int getParentIndex() {
		return parentIndex;
	}


	public void setParentIndex(int parentIndex) {
		this.parentIndex = parentIndex;
	}


	public int getLeftIndex() {
		return leftIndex;
	}


	public void setLeftIndex(int leftIndex) {
		this.leftIndex = leftIndex;
	}


	public int getRightIndex() {
		return rightIndex;
	}


	public void setRightIndex(int rightIndex) {
		this.rightIndex = rightIndex;
	}


	public double getKey() {
		return key;
	}


	public void setKey(double key) {
		this.key = key;
	}


	public Heap getParent() {
		return parent;
	}


	public void setParent(Heap parent) {
		this.parent = parent;
	}


	public Heap getLeft() {
		return left;
	}


	public void setLeft(Heap left) {
		this.left = left;
	}


	public Heap getRight() {
		return right;
	}


	public void setRight(Heap right) {
		this.right = right;
	}


	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Heap getNil(){
		return nil;
	}
}

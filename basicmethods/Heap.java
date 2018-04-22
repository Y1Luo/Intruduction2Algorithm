package com.ITA.basicmethods;

public class Heap {

	private double key;
	private Heap left;
	private Heap right;
	private Heap parent;
	private String color;
	private int nodes;
	
	/*
	 * constructors
	 */
	public Heap(double key){
		this.key=key;
		this.left=null;
		this.right=null;
		this.parent=null;
		this.color="RED";
		this.nodes=0;
	}
	
	public Heap(){
		this.key=Double.MIN_VALUE;
		this.left=null;
		this.right=null;
		this.parent=null;
		this.color="RED";
		this.nodes=0;
	}

	
	/*
	 * getters and setters
	 */
	public double getKey() {
		return key;
	}

	public void setKey(double key) {
		this.key = key;
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

	public Heap getParent() {
		return parent;
	}

	public void setParent(Heap parent) {
		this.parent = parent;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes = nodes;
	}
	
}

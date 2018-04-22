package com.ITA.ch13.RedBlackTree;

import com.ITA.Ch12.BinarySearchTree.Heap;

public class RBTree {	
	private Heap root;
	static Heap nil=null;
	public RBTree(){
		this.setRoot(null);
	}
	/*
	 * 
	 */
	public void insert(double x){
		Heap heap=new Heap(x);
		if(this.getRoot()==null){		//when root is null, the Tree is empty
			this.setRoot(heap);	//set the target heap as root of the tree
			root.setParent(nil);
		}else{
		Heap tempHeap=this.getRoot();
		Heap refHeap=null;
		while(tempHeap!=nil){
			refHeap=tempHeap;
			if(x<tempHeap.getKey()){
				tempHeap=tempHeap.getLeft();
			}else{
				tempHeap=tempHeap.getRight();
			}
		}
		heap.setParent(refHeap);
		if(heap.getKey()<refHeap.getKey()){
			refHeap.setLeft(heap);
		}else{
			refHeap.setRight(heap);
		}
		heap.setLeft(nil);
		heap.setRight(nil);
//		heap.setColor("RED");							//preset when initiate the heap
		}
		this.insertFixup(heap);
	}

	private void insertFixup(Heap heap){
		while(heap.getColor()=="RED"){
			if(heap.getParent()==null){					//case heap is the root, the root must be black
				heap.setColor("BLACK");
			}else{
				Heap parent=heap.getParent();
				Heap grandpa=null;
				Heap uncle=null;
				if(parent.getParent()==null){
					heap=heap.getParent();
				}else{
					grandpa=heap.getParent().getParent();
					if(parent==grandpa.getLeft()){
						uncle=grandpa.getRight();
					}else{
						uncle=grandpa.getLeft();
					}	
				if(uncle.getColor()=="RED"){
					parent.setColor("BLACK");
					uncle.setColor("BLACK");
					grandpa.setColor("RED");
					heap=grandpa;
				}else if(uncle.getColor()=="BLACK"){
					if(heap==parent.getRight()){
						heap=parent;
						rotateToLeft(heap);
						heap.getParent().setColor("BLACK");
						heap.getParent().getParent().setColor("RED");
					}else{
						heap.getParent().setColor("BLACK");
						heap.getParent().getParent().setColor("RED");
						rotateToRight(heap.getParent().getParent());
						heap=heap.getParent();
						}
					}
				}
			}	
		}
	}
	public void rotateToLeft(double k){
		Heap heap=this.search(this.getRoot(), k);
		if(heap.getRight()==null){						//if no right child, can't rotate, return
			return;
		}
		Heap right=heap.getRight();		
		if(heap.getParent()==null){						//reconnect heap parent with heap right child
			this.setRoot(right);
		}else if(heap==heap.getParent().getLeft()){
			heap.getParent().setLeft(right);
			right.setParent(heap.getParent());
		}else{
			heap.getParent().setRight(right);
			right.setParent(heap.getParent());
		}
		
		heap.setRight(right.getLeft());					//reconnect right left child to heap left 
		if(right.getLeft()!=null){
			right.getLeft().setParent(heap);
		}
		
		heap.setParent(right);							//reconnect right to heap's parent
		right.setLeft(heap);
	}
	
	public void rotateToLeft(Heap heap){
		if(heap.getRight()==null){					//if no right child, can't rotate, return
			return;
		}
		Heap right=heap.getRight();					//get temp heap as right for further use
		Heap parent=heap.getParent();				//get temp heap as parent for further use
		if(parent==null){
			this.setRoot(right);
		}else if(heap==heap.getParent().getLeft()){
			parent.setLeft(right);
		}else{
			parent.setRight(right);
		}
		heap.setRight(right.getLeft());
		heap.setParent(right);
		right.setLeft(heap);
		right.setParent(parent);
		if(right.getLeft()!=null){
			right.getLeft().setParent(heap);
		}
	}
	
	public void rotateToRight(double k){
		Heap heap=this.search(this.getRoot(), k);
		if(heap.getLeft()==null){
			return;
		}
		Heap left=heap.getLeft();
		Heap parent=heap.getParent();
		if(parent==null){
			this.setRoot(left);
		}else if(heap==heap.getParent().getLeft()){
			parent.setLeft(left);
		}else{
			parent.setRight(left);
		}
		left.setParent(parent);
		if(left.getRight()!=null){
			left.getRight().setParent(heap);
			heap.setLeft(left.getRight());
		}else{
			heap.setLeft(null);
		}
		left.setRight(heap);
		heap.setParent(left);
	}
	
	public void rotateToRight(Heap heap){
		if(heap.getLeft()==null){
			return;
		}
		Heap left=heap.getLeft();
		Heap parent=heap.getParent();
		if(parent==null){
			this.setRoot(left);
		}else if(heap==heap.getParent().getLeft()){
			parent.setLeft(left);
		}else{
			parent.setRight(left);
		}
		left.setParent(parent);
		if(left.getRight()!=null){
			left.getRight().setParent(heap);
			heap.setLeft(left.getRight());
		}else{
			heap.setLeft(null);
		}
		left.setRight(heap);
		heap.setParent(left);
	}
	 
	public Heap search(Heap heap, double k){
		if(heap==null||k==heap.getKey()){
			return heap;
		}
		if(k<heap.getKey()){
			return search(heap.getLeft(),k);
		}else{
			return search(heap.getRight(),k);
		}
	}
	
	public Heap getRoot() {
		return root;
	}

	public void setRoot(Heap root) {
		this.root = root;
	}

	public Heap getNil() {
		return nil;
	}
	
}

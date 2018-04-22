package com.ITA.basicmethods;


public class RBTree {

	Heap root;
	public RBTree(){
		this.root=null;
	}
	
	public RBTree(Heap heap){
		if(this.root==null){
			this.root=heap;
		}
	}
	
	/*
	 * operational methods
	 */
	public void insert(RBTree rbt, double x){
		Heap heap=new Heap(x);
		//if the tree is empty, the heap is new root
		if(rbt.root==null){
			rbt.root=heap;
		}
		
		Heap temp=rbt.getRoot();
		Heap result=null;
		while(temp!=null){
			result=temp;
			if(x<temp.getKey()){
				temp=temp.getLeft();
			}else{
				temp=temp.getRight();
			}
		}
		heap.setParent(result);
		if(x<result.getLeft().getKey()){
			result.setLeft(heap);
		}else{
			result.setRight(heap);
		}	
	}
	
	public void rotateLeft(RBTree rbt, Heap heap){
		if(heap.getRight()==null){
			System.err.println("heap has not right child, no need to do left rotation");
			return;
		}
		Heap parent=heap.getParent();
		Heap right=heap.getRight();
		//if the head is the root, heap right child to be the new root 
		if(parent==null){
			rbt.setRoot(right);
		}else{
			right.setParent(parent);
			if(heap==parent.getLeft()){
				parent.setLeft(right);
			}else{
				parent.setRight(right);
			}			
		}
		if(right.getLeft()!=null){
			heap.setRight(right.getLeft());
			right.getLeft().setParent(heap);
		}
		right.setLeft(heap);
		heap.setParent(right);	
	}
	
	public void rotateRight(RBTree rbt, Heap heap){
		if(heap.getLeft()==null){
			System.err.println("heap has not left child, no need to do right rotation");
			return;
		}
		Heap parent=heap.getParent();
		Heap left=heap.getLeft();
		//if the head is root, use heap left child to be the new root
		if(parent==null){
			rbt.setRoot(left);
		}{
			left.setParent(parent);
			if(heap==parent.getLeft()){
				parent.setLeft(left);
			}else{
				parent.setRight(left);
			}
		}
		if(left.getRight()!=null){
			heap.setLeft(left.getRight());
			left.getRight().setParent(heap);
		}
		left.setRight(heap);
		heap.setParent(left);
	}
	
	
	/*
	 *  search method
	 */
	public Heap search(RBTree rbt, Heap heap, double x){
		if(rbt.root==null){
			System.err.println("The read black tree is empty");
			return null;
		}
		
		if(x==heap.getKey()){
			System.out.println("the node is found: "+heap);
			return heap;
		}else if(x<heap.getKey()&&heap.getLeft()!=null){
			return search(rbt,heap.getLeft(),x);
		}else if(x<heap.getKey()&&heap.getLeft()==null){
			System.err.println("search failed, no matching node!");
			return null;
		}else if(x>heap.getKey()&&heap.getRight()!=null){
			return search(rbt,heap.getRight(),x);
		}else{
			System.err.println("search failed, no mathcing node!");
			return null;
		}
	}
	
	//search the next one
	public Heap successor(RBTree rbt, double x){
		Heap heap=this.search(rbt, root, x);
		//if there is such heap in the tree, return null
		if(heap==null){
			System.err.println("no such heap");
			return null;
		}
		//case 1, if the heap has right child, get it
		if(heap.getRight()!=null){						
			return heap.getRight();
		}else{
		//case 2, if the heap has not right child, go up, until find the parent, whose left child is heap's series
			while(heap.getParent()!=null && heap.getParent().getRight()!=null && heap==heap.getParent().getRight()){
				heap=heap.getParent();
			}
			if(heap.getKey()>x){
				return heap;
			}else{
			//if return heap is smaller than x, it means the loop breaks before find the right heap, so report failure.
				System.err.println("no successor");
				return null;
			}
		}
	}
	
	
	//search the previous one
	public Heap predecessor(RBTree rbt, double x){
		Heap heap=this.search(rbt, root, x);
		if(heap==null){
			System.err.println("no such heap");
			return null;
		}
		
		//case 1, if the heap has left child, get it
		if(heap.getLeft()!=null){
			return heap.getLeft();
		}else{
			while(heap.getParent()!=null && heap.getParent().getLeft()!=null && heap==heap.getParent().getLeft()){
				heap=heap.getParent();
			}
			if(heap.getKey()<x){
				return heap;
			}else{
				System.err.println("no predecessor");
				return null;				
			}
		}
	}
	
	public void insertFixup(RBTree rbt, Heap heap){
		while(heap.getParent().getColor()=="RED"){
			
		}
	}

	public Heap getRoot() {
		return root;
	}

	public void setRoot(Heap root) {
		this.root = root;
	}
	
	
	
	
	
}

package com.ITA.Ch12.BinarySearchTree;

public class BinarySearchTree {

	private Heap heap;
	private Heap root;
	/*
	 * constructors
	 */
	public BinarySearchTree(){
		this.setRoot(null);
	}
	
	/*
	 * operational methods
	 */
	public void insert(double x){
		Heap heap=new Heap(x);
		if(this.getRoot()==null){
			this.setRoot(heap);
		}else{
			Heap tempHeap=this.getRoot();
			Heap refHeap=null;
			while(tempHeap!=null){
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
		}
	}

	public void delete(double x){
		Heap heap=this.search(getRoot(), x);		//pinpoint the heap with key as x
		if(heap.getParent()==null){
			return;
		}
	
		//case 1, the target heap has neither left nor right heap, just delete the heap
		if(heap.getLeft()==null && heap.getRight()==null){
			if(heap==heap.getParent().getLeft()){
				heap.getParent().setLeft(null);
			}else{
				heap.getParent().setRight(null);
			}
		}
		
		//case 2, the target heap has either left or right heap, connect the child to the parent
		if(heap.getRight()!=null&&heap.getLeft()==null){		//in case heap has only right child
			if(heap==heap.getParent().getLeft()){				//if heap is left child of parent		
				heap.getParent().setLeft(heap.getRight());		//set parent's left child as heap's right child
			}else{												//if heap is right child of parent
				heap.getParent().setRight(heap.getRight());		//set parent's right child as heap's right child 
			}
			heap.getRight().setParent(heap.getParent());		//set heap's right child's parent as heap's parent
		}
		if(heap.getRight()==null&&heap.getLeft()!=null){		//in case heap has only left child
			if(heap==heap.getParent().getLeft()){				//if heap is left child of parent		
				heap.getParent().setLeft(heap.getLeft());		//set parent's left child as heap's left child
			}else{												//if heap is right child of parent
				heap.getParent().setRight(heap.getLeft());		//set parent's right child as heap's left child 
			}
			heap.getLeft().setParent(heap.getParent());			//set heap's left child's parent as heap's parent
		}
		
		//case 3, the target heap has both left and right heap
		//to find the successor of this heap and replace it to the heap.
		if(heap.getRight()!=null && heap.getLeft()!=null){
			Heap successor=this.successor(heap.getKey());		//get the successor as replacement
			if(heap==heap.getParent().getLeft()){				//if heap is left child of parent
				heap.getParent().setLeft(successor);			//set heap's parent's left child as successor
			}else{
				heap.getParent().setRight(successor);			//set heap's parent's right child as successor
			}
			successor.getParent().setLeft(null);				//set initial successor's parent's left child as null
			successor.setParent(heap.getParent());				//set successor's parent as heap's parent
			successor.setLeft(heap.getLeft());					//set successor's left as heaps' left child
			heap.getLeft().setParent(successor);				//set heap's left child's parent as successor
			if(heap.getRight()==successor){						//to identify if the successor is right child of heap, if yes
				successor.setRight(null);						//set right child as null
			}else{												//if not
				successor.setRight(heap.getRight());			//set successor's right as heap's right child
				heap.getRight().setParent(successor);			//set heap's right child's parent as successor				
			}
		}
	}
	
	/*
	 * search methods
	 */
	public Heap search(Heap heap, double k){
		if(heap==null ||	k==heap.getKey()){
			return heap;
		}
		if(k<heap.getKey()){
			return search(heap.getLeft(),k);
		}else{
			return search(heap.getRight(),k);
		}
	}
	
	public Heap searchByLoop(double k){
		Heap heap=this.getRoot();
		while(heap!=null && k!=heap.getKey()){
			if(k<heap.getKey()){
				heap=heap.getLeft();
			}else{
				heap=heap.getRight();
			}
		}
		return heap;
	}
	
	public Heap minimum(Heap heap){
		if(heap.getLeft()==null){
			return heap;
		}
		return minimum(heap.getLeft());
	}
	
	public Heap minimumByLoop(){
		Heap heap=this.getRoot();
		while(heap.getLeft()!=null){
			heap=heap.getLeft();
		}
		return heap;
	}
	
	public Heap maximum(Heap heap){
		if(heap.getRight()==null){
			return heap;
		}
		return maximum(heap.getRight());
	}
	
	public Heap maximumByLoop(){
		Heap heap=this.getRoot();
		while(heap.getRight()!=null){
			heap=heap.getRight();
		}
		return heap;
	}
	
	public Heap successor(double x){
		Heap heap=search(this.getRoot(),x);
		if(heap.getRight()!=null){
			return minimum(heap.getRight());
		}else{
			Heap heap2=heap.getParent();
			while(heap2!=null && heap2.getRight()!=null && heap==heap2.getRight()){
				heap=heap2;
				heap2=heap2.getParent();
			}
				return heap2;		
		}
	}
	
	public Heap successor(Heap heap){
		if(heap.getRight()!=null){
			return minimum(heap.getRight());
		}else{
			Heap heap2=heap.getParent();
			while(heap2!=null && heap2.getRight()!=null && heap==heap2.getRight()){
				heap=heap2; 
				heap2=heap2.getParent();
			}
				return heap2;		
		}	
	}
	
	public Heap predecessor(double x){
		Heap heap=search(this.getRoot(),x);
		if(heap.getLeft()!=null){
			return this.maximum(heap.getLeft());
		}else{
			Heap heap2=heap.getParent();
			while(heap2!=null && heap2.getLeft()!=null && heap==heap2.getLeft()){
				heap=heap2;
				heap2=heap2.getParent();
			}
				return heap2;	
		}
	}
	
	public Heap getRoot() {
		return root;
	}


	public void setRoot(Heap root) {
		this.root = root;
	}
	
	
	
}

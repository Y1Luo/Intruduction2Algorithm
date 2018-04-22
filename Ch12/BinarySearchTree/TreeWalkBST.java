package com.ITA.Ch12.BinarySearchTree;

public class TreeWalkBST {

	private BinarySearchTree bst;
	public TreeWalkBST(BinarySearchTree bst){
		this.bst=bst;
	}
	
	public void inorderTreeWalk(Heap heap){
		if(heap==null){
			return;
		}
		inorderTreeWalk(heap.getLeft());
		System.out.print(heap.getKey()+", ");
		inorderTreeWalk(heap.getRight());
	}
	
	public void preorderTreeWalk(Heap heap){
		if(heap==null){
			return;
		}
		System.out.print(heap.getKey()+", ");
		preorderTreeWalk(heap.getLeft());
		preorderTreeWalk(heap.getRight());
	}
	
	public void postorderTreeWalk(Heap heap){
		if(heap==null){
			return;
		}
		postorderTreeWalk(heap.getLeft());
		postorderTreeWalk(heap.getRight());
		System.out.print(heap.getKey()+", ");
	}
}

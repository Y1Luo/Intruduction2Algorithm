package com.ITA.Ch12.BinarySearchTree;

public class TestBSH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(20);
		bst.insert(10);
		bst.insert(30);
		bst.insert(5);
		bst.insert(15);
		bst.insert(25);
		bst.insert(35);
		bst.insert(3);
		bst.insert(7);
		bst.insert(12);
		bst.insert(18);
		bst.insert(22);
		bst.insert(27);
		bst.insert(33);
		bst.insert(38);
		TreeWalkBST walk=new TreeWalkBST(bst);
		walk.inorderTreeWalk(bst.getRoot());
		System.out.println();		
		bst.delete(30);
		walk.inorderTreeWalk(bst.getRoot());

	}

}

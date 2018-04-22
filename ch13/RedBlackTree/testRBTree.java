package com.ITA.ch13.RedBlackTree;

import com.ITA.Ch12.BinarySearchTree.Heap;

public class testRBTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBTree rbt=new RBTree();
		rbt.insert(11);
		rbt.insert(2);
		rbt.insert(14);
		rbt.insert(1);
		rbt.insert(7);
		
		
		TreeWalkRBTree walk=new TreeWalkRBTree(rbt);		//to display the array
		walk.inorderTreeWalk(rbt.getRoot());				//display by inorder, left-parent-right order
		System.out.println();								

		
	}

}

package com.ITA.Ch06.HeapSort;

public class BuildMinHeap {

	public BuildMinHeap(int[] A){
		for(int i=(A.length-1)/2;i>=0;i--){
			new MinHeapfy(A,i);
		}
	}
}

package com.ITA.Ch06.HeapSort;

public class BuildMaxHeap {

	public BuildMaxHeap(int[] A){
		for(int i=(A.length-1)/2;i>=0;i--){
			new MaxHeapfy(A,i);
		}
	}
}

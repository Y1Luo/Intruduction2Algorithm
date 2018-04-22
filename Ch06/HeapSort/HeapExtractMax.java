package com.ITA.Ch06.HeapSort;

/*
 * to remove and return the max value element of the array 
 */
public class HeapExtractMax {

	public int ExtractMax(int[] A){
		if(A.length<1){
			System.err.print("heap underflow");
			return 0;
		}
		
		new BuildMaxHeap(A); // to build the max Heap, squeeze the max value to the root A[0];
		new MaxHeapfy(A,0,A.length-1);
		return A[0];
	}
}


package com.ITA.Ch06.HeapSort;

public class MinHeapfy {

	public MinHeapfy(int[] A,int i){
		MinHeapfySort(A,i);
	}
	
	private void MinHeapfySort(int[] A, int i){
		Heap heap=new Heap(i);
		int left=heap.Left(i);
		int right=heap.Right(i);
		int lowest=0;
		
		if(left<A.length && A[left]<A[i]){
			lowest=left;
		}else{
			lowest=i;
		}
		if(right<A.length && A[right]<A[left]){
			lowest=right;
		}
		if(lowest != i){
			int temp=A[i];
			A[i]=A[lowest];
			A[lowest]=temp;
			MinHeapfySort(A, lowest);
		}
	}

}

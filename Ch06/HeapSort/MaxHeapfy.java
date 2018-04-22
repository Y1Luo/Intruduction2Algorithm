package com.ITA.Ch06.HeapSort;

public class MaxHeapfy {
	
	public MaxHeapfy(int[] A,int i){
		MaxHeapfySort(A,i);
	}
	
	public MaxHeapfy(int[] A, int i, int j){
		MaxHeapfySort(A,i,j);
	}
	
	
	public void MaxHeapfySort(int[] A, int i){
		Heap heap=new Heap(i);
		int left=heap.Left(i);
		int right=heap.Right(i);
		int largest=0;
		if(left<A.length && A[left]>A[i]){	//compare root with left at first
			largest=left;
		}else{
			largest=i;
		}
		if(right<A.length && A[right]>A[largest]){
			largest=right;
		}
		if(largest != i){
			int temp=A[i];
			A[i]=A[largest];
			A[largest]=temp;
			MaxHeapfySort(A,largest);
		}
	}
	
	public void MaxHeapfySort(int[] A, int i,int j){
		Heap heap=new Heap(i);
		int left=heap.Left(i);
		int right=heap.Right(i);
		int largest=0;
		if(left<j && A[left]>A[i]){	//compare root with left at first
			largest=left;
		}else{
			largest=i;
		}
		if(right<j && A[right]>A[largest]){
			largest=right;
		}
		if(largest != i){
			int temp=A[i];
			A[i]=A[largest];
			A[largest]=temp;
			MaxHeapfySort(A,largest,j);
		}
	}
}

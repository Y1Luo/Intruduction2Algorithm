package com.ITA.Ch06.HeapSort;

public class HeapSort {

	public HeapSort(int[] A){
//		new BuildMaxHeap(A);
		int length=A.length;
		for(int i=length-1;i>0;i--){
			int temp=A[0];
			A[0]=A[i];
			A[i]=temp;
			length--;
			new MaxHeapfy(A,0,length);
			for (int k=0;k<A.length;k++){
				System.out.print(A[k]+", ");
			}	
			System.out.println();
		}
	}
}

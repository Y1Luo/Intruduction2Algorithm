package com.ITA.Ch06.HeapSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={16,4,10,14,7,9,3,2,8,1};
		new MaxHeapfy(A,0);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+", ");
		}
		System.out.println();
		
		new MinHeapfy(A,0);
		for (int i=0;i<A.length;i++){
			System.out.print(A[i]+", ");
		}
		System.out.println();
		System.out.println();
		
		
		new BuildMaxHeap(A);
		for (int i=0;i<A.length;i++){
			System.out.print(A[i]+", ");
		}	
		System.out.println();
		
		new HeapSort(A);
		for (int i=0;i<A.length;i++){
			System.out.print(A[i]+", ");	
			}	
		System.out.println();	
		
		
		
	}
}

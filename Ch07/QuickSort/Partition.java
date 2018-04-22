package com.ITA.Ch07.QuickSort;

public class Partition {

	/*
	 * the basic method of partition, variable A as input array, p as start point and r as end point
	 * set A[r] value as pivot
	 * set i, j loop from A[p] to compare with A[r], then arrange and exchange the value.
	 * move A[r] with final A[i]
	 * no recursive
	 */
	public int ArrayPartition(int[] A, int p, int r){
		int i=p-1;
		int pivot=A[r];
		for(int j=p;j<r;j++){
			if(A[j]<=pivot){
				i++;
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
		int temp=A[r];
		A[r]=A[i+1];
		A[i+1]=temp;
		
		return i+1;
	}
}

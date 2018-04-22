package com.ITA.Ch07.QuickSort;

public class QuickSort {

	public QuickSort(int[] A, int p, int r){
		Sort(A, p, r);
	}
	public void Sort(int[] A, int p, int r){
		if(p<r){
			int q=new Partition().ArrayPartition(A, p, r);
			Sort(A,p,q-1);
			Sort(A,q,r);
		}
	}
}

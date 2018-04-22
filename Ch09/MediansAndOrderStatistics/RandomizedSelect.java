package com.ITA.Ch09.MediansAndOrderStatistics;

public class RandomizedSelect {

	/*
	 * 
	 */
	public RandomizedSelect(){
		
	}
	
	public RandomizedSelect(int[] A,int p, int r, int i){
		
	}
	
	//i is the input of ith small element want to be positioned.
	public int Select(int[] A,int p, int r, int i){
		if(p==i){
			return A[p];
		}
		RandomizedPartition partition=new RandomizedPartition();
		int q=partition.Partition(A, p, r);
		int k=q-p+1;
		if(i==k){
			return A[q];
		}else if(i<k){
			return Select(A,p,q-1,i);
		}else{
			return Select(A,q,r,i-k);
		}
	}
	
	
}

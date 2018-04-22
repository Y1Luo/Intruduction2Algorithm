package com.ITA.Ch09.MediansAndOrderStatistics;

public class RandomizedPartition {

	public RandomizedPartition(){
		
	}
	
	public int Partition(int[] A,int p, int r){
		int i=p-1;
		int key=A[r];
		for(int j=p;j<r-1;j++){
			if(A[j]<key){
				i++;
				int temp=A[j];
				A[j]=A[i];
				A[i]=temp;
			}
			int temp=A[i+1];
			A[i+1]=A[r];
			A[r]=temp;
		}
		return i+1;
	}
}

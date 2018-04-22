package com.ITA.Ch09.MediansAndOrderStatistics;

public class SelectMinMax {

	//constructors
	public SelectMinMax(){
	}
	/*
	 * the simplest way to select the minimum of array
	 * running time O(n-1)
	 */
	public int MinimumSelect(int[] A){
		int min=0;
		for(int i=1;i<A.length;i++){
			if(A[min]>A[i]){
				A[min]=A[i];
			}
		}
		return min;
	}
	
	/*
	 * the simplest way to select the maximum of array
	 * running time O(n-1)
	 */	
	public int MaximumSelect(int[] A){
		int max=0;
		for(int i=1;i<A.length;i++){
			if(A[max]<A[i]){
				A[max]=A[i];
			}
		}
		return max;
	}
	
	/*
	 * the simplest way to select both the maximum and minimum of the array
	 * running time O(3N/2)
	 */	
	public int[] MinAndMax(int[] A){
		int min,max;
		
		//the case of even
		if(A.length%2==1){
			min=max=0;
		//the case of odd
		}else{
			if(A[0]>A[1]){
				max=0;
				min=1;
			}else{
				max=1;
				min=0;
			}
		}
		
		for(int i=1+(A.length-1)%2;i<A.length-1;i++){
			int j=i+1;
			
			if(A[i]<A[min]){
				min=i;
			}
			if(A[j]<A[min]){
				min=j;
			}
			
			if(A[i]>A[max]){
				max=i;
			}
			if(A[j]>A[max]){
				max=j;
			}
		}
		int[] toReturn={min,max};
		return toReturn;
	}
}

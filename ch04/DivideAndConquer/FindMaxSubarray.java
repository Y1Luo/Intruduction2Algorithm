package com.ITA.ch04.DivideAndConquer;

public class FindMaxSubarray {
		private int[] array;
		private int maxLeft;
		private int maxRight;
		private int maxSum;
		
		/*
		 * Constructors
		 */
		public FindMaxSubarray(int[] array, int low, int mid, int high){
			FindMaxCrossSubarray(array,low,mid,high);
		}
		public FindMaxSubarray(int[] array){
			FindMaxCrossSubarray(array, 0, array.length/2,array.length-1);
		}
		
		public FindMaxSubarray(){
			
		}
		
		private void FindMaxByRecurrsive(int[] array, int low, int high){
			if(high==low){
				return;
			}
			int mid=(low+high)/2; 
		}
		
		/*
		 * 
		 */
		public void FindMaxCrossSubarray(int[] array, int low, int mid, int high){
			//compare the left
			int leftSum=Integer.MIN_VALUE;
			int maxLeft=mid;
			int sum=0;
			for(int i=mid;i>=0;i--){
				sum+=array[i];
				if(sum>leftSum){
					leftSum=sum;
					maxLeft=i;
				}
			}
			
			//compare the right
			int rightSum=Integer.MIN_VALUE;
			int maxRight=mid+1;
			sum=0;
			for(int j=mid+1;j<high;j++){
				sum+=array[j];
				if(sum>rightSum){
					rightSum=sum;
					maxRight=j;
				}
			}
			int maxSum=leftSum+rightSum;
			this.maxLeft=maxLeft;
			this.maxRight=maxRight;
			this.maxSum=maxSum;
		}

		public int[] getArray() {
			return array;
		}

		public int getMaxLeft() {
			return maxLeft;
		}

		public int getMaxRight() {
			return maxRight;
		}

		public int getMaxSum() {
			return maxSum;
		}
		
}

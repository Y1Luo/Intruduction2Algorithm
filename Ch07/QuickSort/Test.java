package com.ITA.Ch07.QuickSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] B={16,4,10,14,7,9,3,2,8,1};

		int[] A={2,8,7,1,3,5,6,4};
		new QuickSort(B,0,B.length-1);
		for(int i=0;i<B.length;i++){
			System.out.print(B[i]+", ");
		}
		System.out.println();
	}

}

package com.ITA.ch04.DivideAndConquer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		int[] arr2=new ArrayOfChange().ArrayChange(arr);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+", ");
		}
		System.out.println();
		
		FindMaxSubarray fms=new FindMaxSubarray();
		fms.FindMaxCrossSubarray(arr2, 0, arr2.length/2, arr2.length);
		System.out.println(fms.getMaxLeft());
		System.out.println(fms.getMaxRight());
		System.out.println(fms.getMaxSum());
	}

}

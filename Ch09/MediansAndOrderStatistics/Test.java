package com.ITA.Ch09.MediansAndOrderStatistics;

public class Test {

	public static void main(String[] args){
		int[] B={16,4,10,14,7,9,3,2,8,1,0};

		int[] A={2,8,7,1,3,5,6,4};
		
		SelectMinMax select=new SelectMinMax();
		int[] result=select.MinAndMax(B);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]+", + and the value: "+B[result[i]]);
		}
		System.out.println();
		
//		int i=1;
//		int p=new RandomizedSelect().Select(B, 0, B.length-1, i);
//		System.out.println(p);
	}
}

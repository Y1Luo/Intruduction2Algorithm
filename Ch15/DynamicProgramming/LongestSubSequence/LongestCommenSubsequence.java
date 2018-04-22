package com.ITA.Ch15.DynamicProgramming.LongestSubSequence;

public class LongestCommenSubsequence {

	public void LCS(Character[] x, Character[] y){
		int m=x.length;
		int n=y.length;
		int[][] b=new int[m+1][n+1];
		int[][] c=new int[m+1][n+1];

		//initiate the c matrix
		for(int i=0;i<m+1;i++){
			c[i][0]=0;
		}
		for(int i=0;i<n+1;i++){
			c[0][n]=0;
		}
		
		for(int i=1;i<m+1;i++){
			for(int j=1;j<n+1;j++){
				
			}
		}
	}
}

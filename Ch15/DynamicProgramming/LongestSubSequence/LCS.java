package com.ITA.Ch15.DynamicProgramming.LongestSubSequence;

public class LCS {

	public void LCSLength(char[] x, char[] y){
		//get length of both array
		int m=x.length;
		int n=y.length;
		
		int[][] b=new int[m+1][n+1];
		int[][] c=new int[m+1][n+1];
		
		for(int i=1;i<=m+1;i++){
			c[i][0]=0;
		}
		for(int j=0;j<=n+1;j++){
			c[0][j]=0;
		}
		for(int i=1;i<=m+1;i++){
			for(int j=1;j<=n+1;j++){
				if(x[i]==y[j]){
					
				}
			}
		}
	
		
		
		
		
		
	}
}

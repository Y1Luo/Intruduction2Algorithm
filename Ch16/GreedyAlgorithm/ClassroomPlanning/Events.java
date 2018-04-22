package com.ITA.Ch16.GreedyAlgorithm.ClassroomPlanning;

public class Events{

	public int[] s={0,1,3,0,5,3,5,6,8,8,2,12};
	public int[] f={0,4,5,6,7,9,9,10,11,12,13,16};
	public int[][] table;
	
	public boolean overlap(int i, int j){
		if(f[i]<=s[j]){
//			System.out.println("event "+i+" before event "+ j+", no overlapping!");
//			position='b';
			return false;
		}else if(f[j]<=s[i]){
//			System.out.println("event "+i+" after event "+ j+", no overlapping!");		
//			position='f';
			return false;
		}else{
//			System.out.println("overlapping, no applicable");
//			position='w';
			return true;
		}
	}

	private boolean isMatch(int[]s, int[] f){
		if(s.length!=f.length){
			return false;
		}
		return true;
	}
	
	public int occupation(int i, int j){
//		switch (position){
//		case 'b': this.occupation=f[j]-f[i];
//		case 'f': this.occupation=s[i]-s[j];
//		default:
//			System.err.println("case not appliable!");
//			this.occupation=-1;		
//		}
		if(i<j){
			return f[j]-s[i];
		}else if(i>j){
			return s[i]-s[j];
		}else{
			return 0;
		}
	}

	public int duration(int i){
		return f[i]-s[i];
	}
	
	public int length(int i){
		return f[i]-s[i];
	}
	
	
	public int SolutionByRecursive(){
		int result=0;
		for(int i=1;i<s.length;i++){
			int x=i;
			int y=i;
			result=Math.max(right1(x)+left2(y),result);
		}
		return result;	
	}
	private int right1(int i){
		if(i>11){
			return 0;
		}
		int j=i+1;
		while(j<=11 && overlap(i,j)){
			j++;
		}
		if(j>11){
			return length(i);
		}
		return length(i)+right1(j);
	}
	
	private int left2(int i){
		if(i<1){
			return 0;
		}
		if(i==0){
			return length(i);
		}
		int j=i-1;
		while(j>0 && overlap(i,j)){
				j--;
		}
		if(j<0){
			return length(i);
		}
		return length(i)+left2(j);
	}
	
	public int SolutionByDynamicProgramming(){
		//initiate the table to record the best time consuming
		table=new int[s.length][s.length];
		for(int i=0;i<s.length;i++){
			for(int j=i;j<s.length;j++){
				if(i==j){
					table[i][j]=0;
				}else{
					table[i][j]=-1;
				}
			}
		}
		int result=0;
		for(int i=1;i<s.length;i++){
			int x=i;
			int y=i;
			result=Math.max(right(x)+left(y),result);
		}
		return result;	
	}
	
	private int right(int i){
		if(i>11){
			return 0;
		}
		int j=i+1;
		while(j<=11 && overlap(i,j)){
			j++;
		}
		if(j>11){
			return length(i);
		}
		int result=0;
		if(table[i][j]==-1){
			result=length(i)+right(j);
			table[i][j]=result;
		}else{
			result=table[i][j];
		}
		return result;
	}
	
	private int left(int i){
		if(i<1){
			return 0;
		}
		if(i==0){
			return length(i);
		}
		int j=i-1;
		while(j>0 && overlap(i,j)){
				j--;
		}
		if(j<0){
			return length(i);
		}
		int result=0;
		if(table[i][j]==-1){
			result=length(i)+left(j);
			table[i][j]=result;
		}else{
			result=table[i][j];
		}
		return result;
	}
	
	public void printTable(){
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s.length;j++){
				System.out.print(table[i][j]+",\t");
			}
			System.out.println();
		}
	}

}

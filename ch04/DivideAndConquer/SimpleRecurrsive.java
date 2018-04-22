package com.ITA.ch04.DivideAndConquer;

public class SimpleRecurrsive {

	public int touchDown=0;
	public void rec(int length, int i){
		if(length-i==0){
			System.out.print(i+", ");
			System.out.println("end of one tree");
			touchDown++;
			return;
		}if(length-i<0){
			return;
		}
		System.out.print(i+", ");
		for(int j=1;j<=length-i;j++){
			rec(length-i,j);
		}
	}
	
	public static void main(String[] args){
		SimpleRecurrsive sr=new SimpleRecurrsive();
		sr.rec(4, 1);
		System.out.println();
		System.out.println(sr.touchDown+" time to touch down!");
	}
}

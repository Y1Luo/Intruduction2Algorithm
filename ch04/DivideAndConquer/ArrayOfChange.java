package com.ITA.ch04.DivideAndConquer;

public class ArrayOfChange {

//	public ArrayOfChange(int[] array){
//		
//	}
	
	public int[] ArrayChange(int[] array){
		int[] arrayChange=new int[array.length-1];
		for(int i=1;i<array.length;i++){
			arrayChange[i-1]=array[i]-array[i-1];
		}
		return arrayChange;
	}
	
}

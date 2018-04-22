package com.ITA.Ch01;

public class InsertSortA {

	int[] array;
	public int[] SortA(int[] array){
		for(int j=1;j<array.length;j++){
			int key=array[j];
			//insert A[j] into the sorted sequence A[0...j-1]
			int i=j-1;
			while(i>=0&&array[i]>key){
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
		return array;
	}
}

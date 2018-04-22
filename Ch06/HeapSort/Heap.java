package com.ITA.Ch06.HeapSort;

public class Heap {
	
	//constructor
	public Heap(int i){

	}
	
	/*
	 * if array counted from 1, parent returns i/2 as integer.
	 * in case array counted from 0, parent (p+1)=(i+1)/2 -> p=i/2+1/2-1=(i-1)/2;
	 */
	public int Parent(int i){
		return (i-1)/2;
	}
	
	/*
	 * if array counted from 1, left returns 2*i as integer.
	 * in case array counted from 0, left (l+1)=(i+1)*2 -> l=i*2+2-1=i*2+1;
	 */
	public int Left(int i){
		return i*2+1;
	}

	/*
	 * if array counted from 1, right returns 2*i+1 as integer.
	 * in case array counted from 0, right (r+1)=(i+1)*2+1 -> r=i*2+3-1=i*2+2;
	 */
	public int Right(int i){
		return i*2+2;
	}
}

package com.ITA.Ch01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] array={5,2,4,6,1,3};

		Ch01Ex01InsertionSortB isb=new Ch01Ex01InsertionSortB();
		isb.Sort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+", ");
		}
	}

}

package com.ITA.Ch10.DataStructure;

public class testStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s1=new Stack(5);
		Stack s2=new Stack(8);
		System.out.println(s1.getMax());
		System.out.println(s2.getMax());
		System.out.println();
		System.out.println(s1.get(0));
		System.out.println(s1.getTop());
		System.out.println("--------------evil line-------------");
		int x=100;
		for(int i=s1.getTop();i<s1.getMax()-1;i++){
			s1.Push(x);
			System.out.println("insert the x: "+x);
			x=x+20;
		}
		for(int i=0;i<=s1.getTop();i++){
			System.out.print(s1.get(i)+", ");
		}
		System.out.println();
		while(s1.getTop()>=-3){
			s1.Pop();
			for(int i=s1.getTop()-1;i<=s1.getTop();i++){
				System.out.print(s1.get(i)+", ");
			}
			System.out.println();
		}

	}

}

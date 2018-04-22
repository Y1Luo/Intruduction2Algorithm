package com.ITA.Ch10.DataStructure;

	/*
	 * stack follows the first in last our rule
	 * operation methods including PUSH for insert, POP for pull out.
	 * checking methods including Size, isEmpty
	 */
public class Stack{
	private int max;			//the maximum value index defined for the stack
	private int top;			//the highest index of stack with value
	private double[] arr;		//the real body to save the data for stack
	
	/*
	 * constructors
	 */
	public Stack(int max){
		this.max=max;
		this.top=-1;
		arr=new double[max];
	}
	
	public Stack(){
		
	}

	/*
	 * operational methods
	 */
	public void Push(int x){
		int top=this.top;
		if(top>=max){
			System.err.println("stack overflowed!");
		}else{
			top++;
			this.top=top;
			arr[top]=x;
		}
	}
	
	public void Pop(){
		int top=this.top;
		if(top<0){
			System.err.println("stack underflow!");
		}else{
			top--;
			this.top=top;
		}
	}
	
	public double get(int i){
		if(i>top){
			System.err.println("index beyond limit!");
			return Double.MIN_VALUE;
		}else{
			return arr[i]; 	
		}
	}
	
	/*
	 * getter and setters
	 */
	public int getTop() {
		return top;
	}

	public void setMax(int i){
		if(max!=0){
			System.err.println("this max size has been defined!");
		}else{
			this.max=i;			
		}
	}
	
	public int getMax(){
		return this.max;
	}
}

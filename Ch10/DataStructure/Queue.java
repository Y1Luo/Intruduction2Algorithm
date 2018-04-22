package com.ITA.Ch10.DataStructure;

/*
 * queue follows the first in and first out rule
 * operation methods including ENQUEUE for insert, DEQUEUE for pull out.
 * checking methods including Size, isEmpty
 */
public class Queue {

	private int head;			//head of the value chain
	private int tail;			//right after the last element of the queue and index of next location at which a newly arrived element will be inserted.
	private int max;			//the max length of queue
	private double[] arr;		//the real entity to save all data.
	private boolean empty;	//define if queue is empty
	private boolean full;		//define if queue is full

	
	/*
	 * constructors
	 */
	public Queue(int max){
		this.max=max;
		this.head=-1;
		this.tail=-1;
		arr=new double[max];
	}
	
	public Queue(){
		
	}
	
	/*
	 * operational methods
	 */
	
	public double Get(int i){
		if(i>=this.max){
			System.err.println("index i over limit!");
			return Double.MIN_NORMAL;
		}else{
			return arr[i];
		}
	}
	public void Enqueue(double x){
		if(isFull()==true){
			System.err.println("overflow, can't insert!");
		}else{
			if(tail==max){
				tail=0;
			}
			arr[tail]=x;
			tail++;
			}
	}
	
	public void Dequeue(){
		if(isEmpty()==true){
			System.err.println("underflow, can't dequeue!");
		}else{
			if(head==max){
				head=0;	
			}
				head++;	
		}
	}
	
	public void PrintAll(){
		if(isEmpty()==true){
			System.out.println("the queue is empty!");
		}else if(head<tail){
			for(int i=head;i<tail;i++){
				System.out.print(arr[i]+", ");
			}
			System.out.println();
		}else if(head>tail){
			for(int i=head;i<max;i++){
				System.out.print(arr[i]+", ");
			}
			for(int j=0;j<tail;j++){
				System.out.print(arr[j]+", ");
			}
			System.out.println();
		}
	}
	
	/*
	 * auxiliary methods
	 */
	public boolean isEmpty(){
		if(head==tail){
			this.empty=true;
			return true;
		}
		else{
			this.empty=false;
			return false;
		}
	}
	
	public boolean isFull(){
		if(head == (tail)%(max)){
			this.full=true;
			return true;
		}else{
			this.full=false;
			return false;
		}
	}
	
	/*
	 * getters and setters
	 */
	public int getHead() {
		return head;
	}

	public int getTail() {
		return tail;
	}

	public int getMax() {
		return max;
	}
}

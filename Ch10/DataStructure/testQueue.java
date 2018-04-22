package com.ITA.Ch10.DataStructure;

public class testQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q1=new Queue(5);
		
		boolean empty=q1.isEmpty();
		System.out.println("empty of queue: "+empty);
		
		q1.Enqueue(8.65);
		q1.Enqueue(0.27);
		q1.Enqueue(9.32);
		q1.Enqueue(4.352);
		q1.Enqueue(2.482);
//		q1.Enqueue(5.378);
		
		q1.PrintAll();
//		q1.Dequeue();
//		q1.Dequeue();
//		q1.Dequeue();
//		q1.Dequeue();
//		q1.PrintAll();

	}

}

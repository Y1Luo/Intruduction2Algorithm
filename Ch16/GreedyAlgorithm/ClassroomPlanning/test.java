package com.ITA.Ch16.GreedyAlgorithm.ClassroomPlanning;

import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Events e=new Events();
		Calendar cal1=Calendar.getInstance();
		Date d1=cal1.getTime();
		for(int i=0;i<100000;i++){
			e.SolutionByRecursive();
		}
		Calendar cal2=Calendar.getInstance();
		Date d2=cal2.getTime();
		long time1=d2.getTime()-d1.getTime();
		for(int i=0;i<100000;i++){
			e.SolutionByDynamicProgramming();
		}		
		Calendar cal3=Calendar.getInstance();
		Date d3=cal3.getTime();
		long time2=d3.getTime()-d2.getTime();
		
		System.out.println("time1 is: "+time1);
		System.out.println("time2 is: "+time2);
		
	}

}

package com.ITA.Ch15.DynamicProgramming.CutRod;

import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args){
		Calendar cal1=Calendar.getInstance();
		Date date1=cal1.getTime();
		
		for(int i=0;i<1000000;i++){
			double bestPrice=new CutRod().bestLength(10);			
		}
		Calendar cal2=Calendar.getInstance();
		Date date2=cal2.getTime();
		System.out.println((date2.getTime()-date1.getTime()));
		
		for(int i=0;i<1000000;i++){
			CutRodDynamicUpDown cr1=new CutRodDynamicUpDown();
			double maxPrice=cr1.cutRod(10);
//			System.out.println(maxPrice);
//			cr1.optimizedCutResult();
		}

		Calendar cal3=Calendar.getInstance();
		Date date3=cal3.getTime();
		System.out.println((date3.getTime()-date2.getTime()));
		
		for(int i=0;i<1000000;i++){
			CutRodDynamicUpDown cr=new CutRodDynamicUpDown(10);
//			cr.optimizedCutResult();
		}
		
		Calendar cal4=Calendar.getInstance();
		Date date4=cal4.getTime();
		System.out.println((date4.getTime()-date3.getTime()));	
		
	}
}

package com.ITA.Ch15.DynamicProgramming.CutRod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CutRod {

	private double maxPrice=0;
	private List<Integer> arrCount;
	private Map<Integer,Double> maxPriceMap;
	
	public CutRod(){
		arrCount=new ArrayList<Integer>();
		arrCount.add(0);
	}
	
	public double recursive(int length){
		if(length==0){
			return 0;
		}
		maxPrice=0;

		for(int i=1;i<=length;i++){
//			arrCount.add(i);
			maxPrice=Math.max(maxPrice, pricePerSize(i)+recursive(length-i));
//			arrCount.remove(arrCount.size()-1);
		}
		return maxPrice;
	}

	private static int pricePerSize(int length){
		switch(length){
		case 1: return 1;
		case 2: return 5;
		case 3: return 8;
		case 4: return 9;
		case 5: return 10;
		case 6: return 17;
		case 7: return 17;
		case 8: return 20;
		case 9: return 23;
		case 10: return 25;
		default: 
			System.err.println("Invalide input!");
			return 0;
		}
	}
	
	public double bestLength(int length){
		if(length==0){
			return 0.0;
		}
		double price=Double.MIN_VALUE;
		for(int i=1;i<=length;i++){
			price=Math.max(pricePerSize(i)+bestLength(length-i), price);
		}
		
		return price;
	}
	
	public double getMaxPrice(){
		return maxPrice;
	}
}

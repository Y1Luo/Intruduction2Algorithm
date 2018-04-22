package com.ITA.Ch15.DynamicProgramming.CutRod;

import java.util.ArrayList;
import java.util.List;

public class CutRodDynamicUpDown {

	private double[] maxPriceList;
	private int[] optimizedCut;
	private double maxPrice=0;
	private List<Integer> arrCount;
	private int length;

	public CutRodDynamicUpDown(int length){
		this.length=length;
		arrCount=new ArrayList<Integer>();
		maxPriceList=new double[length+1];
		optimizedCut=new int[length+1];
		memoizedCutRod(length);
	}
	
	public CutRodDynamicUpDown(){
		
	}
	
	/*
	 * finalized methods
	 */
	private double memoizedCutRod(int length){
		for(int i=0;i<=length;i++){
			maxPriceList[i]=-1;
		}
		return cutRodUpDown(length);
	}
	
	private double cutRodUpDown(int length){
		if(maxPriceList.length>=length && maxPriceList[length]>0){
			return maxPriceList[length];
		}
		if(length==0){
			return 0;
		}
		maxPrice=0;
		for(int i=1;i<=length;i++){
//			arrCount.add(i);
			// overwright for count the maxPrice and optmizedCutLength for current length
			double price=pricePerSize(i)+cutRodUpDown(length-i);
			if(price>maxPrice){
				maxPrice=price;
				optimizedCut[length]=i;
			}
//			maxPrice=Math.max(maxPrice,pricePerSize(i)+cutRodUpDown(length-i));
//			arrCount.remove(arrCount.size()-1);
		}
		maxPriceList[length]=maxPrice;
		return maxPrice;
	}
	
	
	/*
	 * new practice
	 */
	public double cutRod(int length){
		//initiate the memorize tables;
		this.length=length;
		maxPriceList=new double[length+1];
		optimizedCut=new int[length+1];
		maxPriceList[0]=0.0;
		optimizedCut[0]=0;
		for(int i=1;i<length+1;i++){
			maxPriceList[i]=-1.0;
			optimizedCut[i]=0;
		}
		return bestPrice(length);
	}
	
	private double bestPrice(int length){
		double maxPrice=-1.0;
		double tempPrice=0;;
		int bestCut=0;
		if(length==0){
			maxPrice=0.0;
		}
		
		for(int i=1;i<length+1;i++){
			if(maxPriceList[length-i]==-1.0){
				tempPrice=bestPrice(length-i);
			}else{
				tempPrice=maxPriceList[length-i];
			}
			double price=pricePerSize(i)+tempPrice;
			if(maxPrice<price){
				maxPrice=price;
				bestCut=i;
			}
		}
		if(maxPriceList[length]<maxPrice){
			maxPriceList[length]=maxPrice;
			optimizedCut[length]=bestCut;
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

	public void PrintMemoizedPriceList(){
		for(int i=0;i<maxPriceList.length;i++){
			System.out.print(maxPriceList[i]+", ");
		}
		System.out.println();
	}
	
	public double getMaxPrice() {
		return maxPrice;
	}
	
	public void optimizedCutResult(){
		System.out.println("the max price is: "+maxPriceList[length]);
		while(length>0){
			System.out.print(optimizedCut[length]+", ");
			length-=optimizedCut[length];
		}
		System.out.println();
	}
	
	
	
}

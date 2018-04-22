package com.ITA.Ch15.DynamicProgramming.CutRod;

public class CutRodDynamicDownUp {

	private double[] maxPriceList;
	private int[] optimizedCut;
	private double maxPrice;
	private int length;
	
	
	/*
	 * constructors
	 */
	public CutRodDynamicDownUp(int length){
		cutRod(length);
		this.length=length;
	}
	
	public CutRodDynamicDownUp(){
		
	}
	
	
	/*
	 * recursive methods
	 */
	private void cutRod(int length){
		maxPrice=0;
		maxPriceList=new double[length+1];
		optimizedCut=new int[length+1];
		maxPriceList[0]=0.0;						//price is 0 when length 0
		optimizedCut[0]=0;
		for(int i=1;i<=length;i++){
			maxPriceList[i]=-1.;
			optimizedCut[i]=0;
			for(int j=1;j<=i;j++){
				double price=pricePerSize(j)+maxPriceList[i-j];
				if(price>maxPrice){
					maxPrice=price;
					optimizedCut[i]=j;
				}
			}
			maxPriceList[i]=maxPrice;
		}
	}

	
	/*
	 * subsidary methodes
	 */
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
	
	
	/*
	 * getters and setters
	 */
	public double getMaxPrice(){
		return maxPrice;
	}
	
	public void printMaxPriceList(){
		for(int i=1;i<maxPriceList.length;i++){
			System.out.print("index "+i+": "+maxPriceList[i]+", ");
		}
		System.out.println();
	}
	
	public void printOptmizedCutList(){
		for(int i=1;i<optimizedCut.length;i++){
			System.out.print("index "+i+": "+optimizedCut[i]+", ");
		}
		System.out.println();
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

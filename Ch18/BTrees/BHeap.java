package com.ITA.Ch18.BTrees;

import java.util.ArrayList;
import java.util.List;

public class BHeap {

	private int t;
	private List<Object> keyList;
	private List<BHeap> childList;
	private boolean isLeap;
	
	public BHeap(int t){
		this.t=t;
		keyList=new ArrayList<Object>();
		childList=new ArrayList<BHeap>();
	}
	
	public boolean check(BHeap bHeap){
		if(bHeap.isLeap){
			if(bHeap.keyList.size()!=0 || bHeap.childList.size()!=0){
				return false;
			}
		}else{
			if(bHeap.keyList.size()<(t-1)||bHeap.keyList.size()>(2*t-1)){
				System.out.println("key number beyond limit!");
				return false;
			}
			
			if(bHeap.childList.size()<t || bHeap.keyList.size()>(2*t)){
				System.out.println("children number beyond limit!");
				return false;
			}
		}
		return true;
	}

	
	//getters and setters
	public int getT() {
		return t;
	}

	public List<Object> getKeyList() {
		return keyList;
	}

	public List<BHeap> getChildList() {
		return childList;
	}

	public boolean isLeap() {
		return isLeap;
	}
	
}

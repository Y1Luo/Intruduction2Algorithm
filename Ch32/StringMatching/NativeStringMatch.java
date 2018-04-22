package com.ITA.Ch32.StringMatching;

public class NativeStringMatch {

	public NativeStringMatch(String str1, String str2){
		match(str1,str2);
	}
	
	private void match(String str1,String str2){
		int len1=str1.length();
		int len2=str2.length();
		if(len1 == 0 || len2 == 0 || len1<=len2){
			return;
		}	
		for(int i=0;i<len1-len2+1;i++){
			String substr=str1.substring(i, i+len2);
			if(str2==substr){
				System.out.println("match!");
			}else{
				System.out.println("wrong!");
			}
		}
	}
}

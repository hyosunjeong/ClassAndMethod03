package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {

	List<String> strList;
	
	public MyClass05() {
		strList = new ArrayList();
		
	}
	public void push(String num) {
		strList.add(num);
		
		
	}
	
	public String show() {
		
		String strSum = "";
		int intLen=strList.size();
		for(int i=0; i< intLen; i++ ) {
			
			strSum += strList.get(i) ;
			
			
			
			/*
			 * public void show(){
			 * 	String sRet="";
			 * 	for(String s: strList){
			 * 		sRet += s;
			 * 	}
			 * }
			 * return sRet
			 */
			
			
		}
		return strSum;
	}
	
	
	
}

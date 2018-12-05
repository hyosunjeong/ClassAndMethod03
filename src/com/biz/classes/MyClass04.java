package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	List<Integer> intList;
	
	
	public MyClass04() {
		intList = new ArrayList();
		
	}
	
	public void push(String num) {
	int intNum =Integer.valueOf(num);
		intList.add(intNum);
		
		// Public void push(String num){
		// 	intList.add(Integer.valuof(num));
		
		
		
	}
	
	public int show() {
		
		int intMulti = 1;
		for(int i : intList) {
			intMulti *= i;
			
		}
		return intMulti;
	}
	
	
}

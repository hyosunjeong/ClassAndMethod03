package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	List<Integer> intList; //리스트 선언
	
		public MyClass02() { 
	intList = new ArrayList(); // 리스트 초기화
			
	}
	
	public void push(int num) {
		intList.add(num);
		
	}

	public void show() {
		
		int intMulti = 1;
		for(int i : intList) {
			intMulti *= i;
			
		}
		System.out.println(intMulti);
		
	}

}

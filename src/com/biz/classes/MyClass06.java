package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {
	
	List<Integer> intList;
	
	public MyClass06() {
		intList = new ArrayList();
	}
		
		
		public void push(int num){
			intList.add(num);
			
		}
		
		public String show() {
			String strN = "";
			for(int i : intList) {
				
				strN += i; // ""+숫자
				//strN += String.valueOf(i); // 문자열""뒤에 +숫자가 오면 자동으로 문자열로 바꿔주기 때문에
											// String.valueof()를 써주지 않아도 된다.
				
			}
			return strN;
		}
		
		
		
	

}

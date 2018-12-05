package com.biz.classes;

public class MyClass08 {

	
	public void show(char c1, char c2) {
		
		for(int i = c1 ; i <=c2;  i++) {
			System.out.print((char)i);
			// 바로 출력
		} 
		String s = "";
		for(int i = c1; i <=2; i++) {
			char c = (char)i;
			s += String.valueOf(c);
			// char를 문자형으로 바꿔서 출력
		}
		System.out.print(s);
	}
	
}

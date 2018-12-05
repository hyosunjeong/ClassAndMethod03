package com.biz.classes;

public class MyClass07 {
	
	String[] strName1 ; // 배열 선언
	
	
	public void insert(String strName) {
		strName1=strName.split(""); // 배열을 선언만 한 상태에서 문자열을 나누면 그 문자를 모아 배열을 생성한다.
									// 그래서 굳이 생성자가 필요하지 않다.
		
	}
	
	public void show() {
		
		for(String i : strName1) {
			System.out.print(i+",");
			
		}
		System.out.println("-" + strName1.length + "글자");
		
	}

}

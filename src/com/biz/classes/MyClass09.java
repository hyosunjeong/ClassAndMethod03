package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass09 {

	List<String> strList;
	
	public MyClass09() {
		strList = new ArrayList();
	
	}
	// strList에 문자열을 하나씩 추가
	public void push(String s) {
		strList.add(s);
	}
	
	// 0번 위치의 문자열을 console에 출력하고
	// 0번 위치의 문자열을 삭제한다.
	public void pop() {
		// strList의 개수가 1이상인가 확인
		if(strList.size() > 0) {
			System.out.println(strList.get(0));
			strList.remove(0);
		}else {
			System.out.println("더이상 출력할 값이 없음");
		}
	}


}



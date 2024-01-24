package com.yedam.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperExe {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		List<int> linst;
		list.add(new Integer(1));
//		기본타입 <-> 래퍼클래스
		list.add(Integer.valueOf(1));
		list.add(1);
		
		double d1 = Double.valueOf("2.3").doubleValue();
		
		System.out.println(Math.ceil(2.1));
	}
}

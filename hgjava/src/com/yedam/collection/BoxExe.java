package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {
//		제너릭 타입사용
		Box<String> box = new Box<String>();
		box.setObj("Hong");
		String result = box.getObj();

		Box<Integer> boxi = new Box<>();
		boxi.setObj(100);
		Integer resulti = boxi.getObj();

//		List<Integer> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.add("");

//		타입에러 오류발생
//		List list = new ArrayList();
//		list.add("");
//		list.add(123);
//		
		for (int i = 0; i < list.size(); i++) {
			String result1 = (String) list.get(i);
		}

//		타입을 미리 지정한 경우
//		Box box = new Box();
//		box.setObj(100);
//		box.setObj("Hong");
//		String result = (String) box.getObj();
//		Integer result = (Integer) box.getObj();		
//		int result = (Integer) box.getObj();

//		System.out.println(result);
	}// end of main
}

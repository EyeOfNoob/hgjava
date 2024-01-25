package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExe2 {
	public static void main(String[] args) {
//		ArrayList 1000만건 생성
		long start = System.currentTimeMillis();
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < 10000000; i++) {
			list1.add(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.print("결과1: " + (end - start));
		double second = (double)(end - start)/1000;
		System.out.printf(" = %.3f초 걸렸습니다.\n", second);

//		ArrayList 인덱스 0번에 10만건 생성
		start = System.currentTimeMillis();
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.print("결과1-1: " + (end - start));
		second = (double)(end - start)/1000;
		System.out.printf(" = %.3f초 걸렸습니다.\n", second);

//		LinkedList 1000만건 생성
		start = System.currentTimeMillis();
		List<String> list3 = new LinkedList<>();
		for (int i = 0; i < 10000000; i++) {
			list3.add(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.print("결과2: " + (end - start));
		second = (double)(end - start)/1000;
		System.out.printf(" = %.3f초 걸렸습니다.\n", second);

//		LinkedList 인덱스 0번에 10만건 생성
		start = System.currentTimeMillis();
		List<String> list4 = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			list4.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.print("결과2-1: " + (end - start));
		second = (double)(end - start)/1000;
		System.out.printf(" = %.3f초 걸렸습니다.\n", second);
	}
}

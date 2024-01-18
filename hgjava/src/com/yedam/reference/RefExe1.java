package com.yedam.reference;

public class RefExe1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
//		값을 비교
		System.out.println(n1 == n2);
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
//		주소값을 비교
		System.out.println(str1 == str2);
//		equals로 비교
		System.out.println(str1.equals(str2));
		
//		new int[10] = new int[] {0,0,0,0,0,0,0,0,0,0}
		int[] intAry = new int[10];
		System.out.println(intAry[0]);
		
		intAry = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(intAry[1]);
		
		intAry = null;
		try {
			System.out.println(intAry[0]);
		} catch (Exception e) {
			System.out.println("오류발생");
		}
	}
}

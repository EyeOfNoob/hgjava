package com.yedam.variable;

public class VariableExe1 {
	public void sum() {
		int n2;
	}
	public static void main(String[] args) {
		// let n = '10;
		// const obj = {name:"홍길동", age:20, showinfo(){  } }
		int n1 = 2147483647; // int(기본데이터타입) wrapper클래스 : Integer.
		n1 = -2147483647;
		System.out.println(Integer.MAX_VALUE);
		
		long n2 = 2147483648L;
		n2 = -2147483648L;
		
		double n3 = Math.random(); // 0 ~ 1 임의의 실수.
		
		int n4 = (int)(Math.random()* 10); // 0 ~ 10 임의의 실수.
		
		String str = "홍길동";
		
		//int n2; 두번 선언이 불가.
		byte b1 = 127;
		System.out.println(Short.MAX_VALUE);
		Short s1 = 32767;
		
		short s3 = (short) (s1 - 30);  // 일반적인 연산기호는 int(일반 정수)값을 출력하므로 short변환 해주어야함
		// 왼쪽항 = 오른쪽항 : 항상 타입이 동일해야함.
		double d1 = (double) 40;
		
	}
}

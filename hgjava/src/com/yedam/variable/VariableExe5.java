package com.yedam.variable;

public class VariableExe5 {
	public static void main(String[] args) {
		
		double d1 = 10.0;
		double result = d1 + (double) 20.0f;
		System.out.println(result);
		
		int sum = 60;
		result = sum*1.0 / 7; //둘다 정수 연산하면서 소수점 이하는 버리게됨 -> *1.0 추가시 실수 연산이 됨
		System.out.println(result);
		
//		sum = "1" + 3; 문자열 + 정수 계산이므로 에러발생
		sum = Integer.parseInt("1") + 3 + 5; //문자열을 정수로 변환하여 계산
		System.out.println(sum);
		
		result = Double.parseDouble("1.234") + 2.3; //문자열을 실수로 변환하여 계산
		System.out.println(result);
		
		String str = "1" + 3; 
		System.out.println(str);
		
		// char 65536개에 문자에 대응하는 숫자 배당 
		for(int i = 0; i< 5; i++) {
			int temp = (int) (Math.random()*25)+97;
			System.out.println((char)temp);
		}
	}
	
}

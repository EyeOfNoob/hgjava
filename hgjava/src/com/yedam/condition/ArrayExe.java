package com.yedam.condition;

public class ArrayExe {
	public static void main(String[] args) {
		
		int[] intAry = {10, 20, 30}; // int intAry  배열을 넣을떄는 {}
		intAry[2]= 40;	//index값에 40을 넣습니다. 값을 변경하지 못함
		
		intAry = new int[] {10,20,30,40,50};		// 선언했던걸 다시할려면 new int[]를 써야함
		intAry = new int[10];						// 0이 10개가 들어있음
		
		System.out.println(intAry[0]+", 크기:" + intAry.length); 
		intAry[0] = 100;
		
		for(int i=0; i < 10; i++) {
			intAry[i] = (int) (Math.random() * 10);
			System.out.println("랜덤값은" + intAry[i]);
		}
		//2, 3의 배수의 값을 각각 int sum2, sum3에 저장.
		int sum2;
		int sum3;
		sum2 = sum3 = 0;
		for (int i = 0; i<10; i++) {
			if(intAry[i] % 3 == 0) {
				sum3 += intAry[i];
			
			}if (intAry[i] % 2 == 0) {
				sum2 += intAry[i];
			}
		}
		System.out.println("2의 배수는" + sum2);
		System.out.println("3의 배수는" + sum3);
//		for(int i=0; i < 10; i++) {
//			if (intAry[i] % 3 == 0) {
//				sum3[] += intAry[i];
//				System.out.println("3의 배수입니다" + sum2);
//			}else if (intAry[i] % 2 == 0) {
//				sum2[]+= intAry[i];
//				System.out.println("2의 배수입니다." + sum3);
//			}
//		}
		//코드작성...
		// 각각 출력..... 2의배수 6의 배수이기도 
		String[] strAry = {"Hong", "Park", "kim", "20"};	// 문자열 배열을 넣고싶습니다.
		for(int i=0; i < strAry.length; i++) {
			intAry[i] = (int) (Math.random() * 10);
		}
		}
		
	}
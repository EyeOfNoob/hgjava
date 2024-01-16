package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //System.in <= 키보드입력값
		//이름입력 (=name), 연락처(=phone) : scn.nextLine()
		System.out.println("이름 입력 >> ");
		String name = scn.nextLine();
		System.out.println("연락처 입력 >>");
		String phone = scn.nextLine();
		System.out.println("이름 : " + name + ", 연락처 : " + phone);
		//영어(=eng), 수학(=math) => 합계(=sum) scn.nextInt()
		System.out.println("영어 입력 >>");
		int eng = scn.nextInt();
		System.out.println("수학 입력 >>");
		int math = scn.nextInt();
		int sum = eng + math ;
		System.out.println("영어 : " + eng + ", 수학 : " + math + ". 합계: " + sum);
		
		scn.close();  //스캔값 초기화
//		결과
//		이름 입력 >> 
//		홍길동
//		연락처 입력 >>
//		010-1111-2222
//		이름 : 홍길동, 연락처 : 010-1111-2222
//		영어 입력 >>
//		80
//		수학 입력 >>
//		85
//		영어 : 80, 수학 : 85. 합계: 165

		
//		System.out.println("이름을 입력>>> ");
//		String result = scn.nextLine(); //입력값을 문자열로 반환.
//		System.out.println("당신의 이름은 " + result + "입니다");
//		
//		System.out.println("나이를 입력>>> ");
//		int result2 = scn.nextInt();
//		System.out.println("당신의 나이는 " + result2 + "세 입니다");
		
	}
}

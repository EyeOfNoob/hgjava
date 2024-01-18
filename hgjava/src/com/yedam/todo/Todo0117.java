package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {
//	배열을 활용한 메세지 출력
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
//		친구3명의 이름과 연락처를 입력하도록..메세지출력.
//		입력 완료.
		String[] strAry = new String[6];
		int idx = 0;
		for (int i = 1; i<=3; i++) {
			System.out.println("이름>>> ");
			strAry[idx++] = scn.nextLine();
			System.out.println("연락처>>> ");
			strAry[idx++] = scn.nextLine();
		}
		
		for(int i = 0; i< strAry.length; i++) {
//			6번 반복..
			if(i%2==0) {
//			이름 출력
				System.out.println("이름 : " + strAry[i]);
			}else {
				System.out.println("연락처 : " + strAry[i]);
			}
		}
		
//		이름 : 홍길동
//		연락처 : 010-1111-1111
//		====================
//		이름 : 김길동 
//		연락처 : 010-2222-2222
//		====================
//		이름 : 박길동 
//		연락처 : 010-3333-3333
//		====================
		
	}
	
}

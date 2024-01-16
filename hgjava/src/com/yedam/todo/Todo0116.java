package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("값을 입력>>> ");
		String input = scn.nextLine(); 
		// 자바스크립트에서는 ==로 동일확인 
		// 자바에서는 input.equals("quit")로 확인
			
		// 입력값은 홍길동 입니다.
		
		// quit 값이 들어오면 콘솔에 <<end of prog>>
		scn.close();
	}
}

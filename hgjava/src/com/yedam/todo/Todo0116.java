package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		// 입력값은 홍길동 입니다.
		while (true) {
			System.out.println("값을 입력>>> ");
			String input = scn.nextLine(); 
			System.out.println("입력값은 " + input + "입니다");
		// quit 값이 들어오면 콘솔에 <<end of prog>>
			if(input.equals("quit")) {
				System.out.println("<<end of program>>");
				break;
			}
		}
		// 자바스크립트에서는 ==로 동일확인 
		// 자바에서는 input.equals("quit")로 확인
			
		
		scn.close();
	}
}

package com.yedam.condition;

import java.util.Scanner;

public class WhileLoopExe2 {
	public static void main(String[] args) {
		String a = "가나다라";
		System.out.println(a);
		System.out.println(a.length());
		
		Scanner scn = new Scanner(System.in);
//		어떤 조건일 동안 반복.
		// 1 ~ 10 정수
		int random = (int) (Math.random() * 100) +1; 
		while(true) {
			System.out.println("값입력>> ");
			int Num = scn.nextInt();
			
//			if(random == Num) {
//				System.out.printf("임의값 %d\n", random);
//				break;
//			}
//			if(random > Num) {
//				System.out.println("틀린값입니다. 임의값보다 작습니다.");
//				continue;
//			}else {
//				System.out.println("틀린값입니다. 임의값보다 큽니다.");
//			}
			
			if(random == Num) {
				System.out.printf("임의값 %d\n", random);
				break;
			}else if(random > Num) {
				System.out.println("틀린값입니다. 임의값보다 작습니다.");
			}else if(random < Num) {
				System.out.println("틀린값입니다. 임의값보다 큽니다.");
			}
			
		}
		System.out.println("end of prog.");
	}
}

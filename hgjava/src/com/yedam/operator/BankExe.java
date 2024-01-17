package com.yedam.operator;

import java.util.Scanner;

// 은행계좌. 10만원이 초과하는 금액 입금시 입금이 안되도록 설정
// 55000 - 60000 마이너스 계좌가 되는 출금 금지.

public class BankExe {
	public static void main(String[] args) {
		// 입금, 출금, 잔고, 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료.");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
				case 1: System.out.println("입금액>> ");
						int inM = Integer.parseInt(scn.nextLine());
						if(inM + balance > 100000) {
							System.out.printf("잔고 총액은 10만원을 넘을수 없습니다.(%d원 입금시 잔고 10만원 초과)\n", inM);
							System.out.println("잔고 총액은 10만원을 넘을수 없습니다.(" + inM + "원 입금시 잔고 10만원 초과)");
							break;
						}
						balance += inM;
						System.out.println("저장성공!");
						break;
				case 2: System.out.println("출금액>> ");
						int outM = Integer.parseInt(scn.nextLine());
						if(outM <= balance) {
							balance -= outM;
							System.out.println("저장성공!");
						}else if(outM > balance) {
							System.out.println("잔고를 초과하는 금액은 입금할 수 없습니다");
						}
						break;
				case 3:	System.out.printf("잔고: %d\n", balance);
						break;
				case 4: System.out.println("종료성공!");
						run = false;
						break;
					
			}
//			break;
		}
		scn.close();
		System.out.println("end of prog.");
	}
}

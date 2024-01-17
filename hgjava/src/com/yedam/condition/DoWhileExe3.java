package com.yedam.condition;

public class DoWhileExe3 {
	public static void main(String[] args) {
		
		boolean run = false;
		int cnt = 0;
//		while(run) {
//			System.out.println("한번 출력합니다...");
//		}
		do {
			System.out.println("한번 출력합니다... cnt: " + cnt);
			run = true;
			if (cnt > 3) {
				run = false;
			}
			cnt++;
		} while (run);
		System.out.println("end of prog.");
	}
}

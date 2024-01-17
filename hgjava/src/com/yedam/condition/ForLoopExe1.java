package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
//		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if (i>5) {
				break;
			}
		}
//		1~10까지 합을 계산
		int sum=0;
		int sum1=10;
		for (int n=1; n<=10; n++) {
			sum += n;
		}
		System.out.printf("누적값은 %d\n", sum, sum1);
		
//		1~31까지 반복
		
		String str = " ";
		System.out.printf("%3s", str);
//		System.out.println(str.length());
		for(int d = 1; d <= 31; d++) {
			System.out.printf("%3d", d);
			if((str.length() + d) % 7 == 0) {
				System.out.printf("\n");
			}
		}
		
		
//		System.out.println(i); 반복문 밖에서 i값을 가져오려했으므로 에러발생
		
	}
}

package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("친구입력>>> ");
		String name = scn.nextLine();
		
		String[] friends = { "홍길동", "김민수", "박석민", "최홍만", "김길동" };
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4};
		int[] scores = new int[5];
		scores[0] = 78;
		scores[1] = 92;
		scores[2] = 95;
		scores[3] = 90;
		scores[4] = 91;
//		java 에서 다중 타입을 가진 다중 배열을 만들때는 class를 사용할것.
//		String[][] fInfo = (String) {friends, dblAry, scores};
//		김민수는 72.5kg, 92점 입니다.
		for(int i = 0; i<friends.length; i++) {
			if(name.equals(friends[i])) {
			System.out.printf("%s는(은) %.1f kg, %d점 입니다.\n", friends[i], dblAry[i], scores[i]);
			}
		}
		
		//배열의 값 중에서 제일 큰값을 출력.
		int sMax = 0;
		int sMin = scores[0];
		String hSName = "";
		String rSName = "";
		double hSWeight = 0;
		double rSWeight = 0;
		for(int i =0; i< scores.length; i++) {
			if(sMax < scores[i]) {
				sMax = scores[i];
				hSName = friends[i];
				hSWeight = dblAry[i]; 
			}
			if(sMin >= scores[i]) {
				sMin = scores[i];
				rSName = friends[i];
				rSWeight = dblAry[i];
			}
		}
		System.out.printf("최고 성적자 %s는(은) %.1f kg, %d점 입니다.\n", hSName, hSWeight, sMax);
		System.out.printf("최저 성적자 %s는(은) %.1f kg, %d점 입니다.\n", rSName, rSWeight, sMin);
//		System.out.println();
		
//		김민수는 2번째 있습니다.
//		int fCount = 1;
//		for(int i = 0; i<friends.length; i++) {
//			if(name.equals(friends[i])) {
//				System.out.println(name + "은(는) " + (i + 1)+ "번째에 있습니다.");
//			}else {
//				fCount++;
//			}
//		}
//		if(fCount == friends.length) {
//			System.out.println("찾는 친구는 없습니다.");
//			fCount = 1;
//		}
		
		boolean isExist = false;
		for(int i = 0; i<friends.length; i++) {
			if(name.equals(friends[i])) {
				System.out.println(name + "는(은) " + (i + 1)+ "번째에 있습니다.");
				isExist = true;
			}
		}
		if(!isExist) {
			System.out.println("찾는 친구는 없습니다.");
		}
		
		
		System.out.println("\nend of prog.");
	}
	
	public static void mehod2() {
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4};
		//배열의 값 중에서 제일 큰값을 출력.
		double max = 0;
		double min = dblAry[0];
		for(int i =0; i< dblAry.length; i++) {
			if(max < dblAry[i]) {
				max = dblAry[i];
			}
			if(min > dblAry[i]) {
				min = dblAry[i];
			}
		}
		System.out.printf("몸무게 최대값은 %.1f, 최소값은 %.1f입니다.\n", max, min);
//		System.out.println();
		
		double sum = 0;
		double avg = 0;
		//친구의 평균 몸무게는 78.8입니다.
		for(int k = 0; k< dblAry.length; k++) {
			sum += dblAry[k];
		}
		avg = sum/dblAry.length;
		System.out.printf("친구의 몸무게평균은 %.1f\n", avg);
//		System.out.println();
//		System.out.println(avg);
//		System.out.println();
//		System.out.printf("%f", avg);
//		System.out.println();
//		System.out.printf("%1f", avg);
	}	
	public static void method1() {
		int[] scores = new int[10];
		
		scores[3] = 40;
		scores = new int[5];
		scores[4] = 50;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=>" + scores[i]);
		}
		
//		78,82,77,90,85 성적점수 배열만들기
//		int[] sco = new int[] {78,82,77,90,85};
		int[] sco = new int[5]; 
		sco[0] = 78;
		sco[1] = 82;
		sco[2] = 77;
		sco[3] = 89;
		sco[4] = 85;

//		80점이 넘는 학생 카운팅 하기
//		90점 이상 학생은 없습니다.
		int count = 0;
		int count2 = 0;
		for(int i =0; i <sco.length; i++) {
//			System.out.println("sco[" + i + "]=>" + sco[i]);
			if(sco[i] >= 80) {
				System.out.println("80점이 넘는 idx 번호는 " + i + "입니다. (" + sco[i] + "점)");
				count ++;
			}
			if(sco[i] >= 90) {
				count2 ++;
			}
		}
		System.out.println("80점 이상인 학생은 " + count + "명 입니다.");
		if(count2 == 0) {
			System.out.println("90점 이상인 학생은 없습니다.");
		}else {
			System.out.println("90점 이상인 학생은 " + count2 + "명 입니다.");
		}
		System.out.println("end of prog.");
	}
}

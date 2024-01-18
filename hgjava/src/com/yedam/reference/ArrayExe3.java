package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {
		//초기화.(인스턴스(메모리) 생성)
		Friend f1 = new Friend();
		f1.name = "홍길동";
		f1.weight = 67.8;
		f1.score = 80;
		
		Friend f2 = new Friend();
		f2.name = "김길동";
		f2.weight = 77.8;
		f2.score = 86;
		
		Friend f3 = new Friend();
		f3.name = "김민석";
		f3.weight = 79.8;
		f3.score = 88;

//		새로운 친구
		String name = "김말숙";
		double weight = 55.5;
		int score = 88;
		
		Friend f4 = new Friend();
		f4.name = name;
		f4.weight = weight;
		f4.score = score;
		
		
		Friend[] friends = {f1, f2, f3};
		// {null, null, null, null, null}
		friends = new Friend[5]; 
		// {f1, f2, f3, f4, null}
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;

//		김말숙 => 88점 -> 90점으로 변경.
//		직접 지정해서 변경
//		System.out.println(f4.name + "의 점수 " + f4.score);
//		for(int i = 0; i < friends.length; i++) {
//			if(friends[i] !=null && friends[i].name.equals("김말숙")) {
//				friends[i].score = 90;
//				System.out.println(friends[i].name + "의 점수 변경!");
//				System.out.println(friends[i].name + "의 점수 " + friends[i].score);
//			}
//		}
//		찾을친구>>> => 변경점수입력>>> => 전체출력
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름>>> ");
		String fName = scn.nextLine();
		System.out.println("변경할 점수>>> ");
		int cScore = scn.nextInt();
		for (int i = 0; i <friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals(fName)) {
				friends[i].score = cScore;
				System.out.println("변경 완료!");
			}
		}
		
//		목록출력.
		for (int i = 0; i <friends.length; i++) {
			if(friends[i] != null) {
				System.out.printf("%s 의 몸무게는 %.1fkg 점수는 %d\n", friends[i].name, friends[i].weight, friends[i].score);
			}
		}
		
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals("김민석")) {
				System.out.printf("몸무게는 %.1fkg 점수는 %d", friends[i].weight, friends[i].score);
				
			}
		}
		
	}
}

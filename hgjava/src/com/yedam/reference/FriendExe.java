package com.yedam.reference;

import java.util.Scanner;

//친구의 정보를 저장하고 변경하고...관리.
//Create(생성), Read(조회), Update(갱신,변경), Delete(삭제). = CRUD
public class FriendExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[5];
		
		while(run) {
			try {
				System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료");
				int menu = Integer.parseInt(scn.nextLine());
//			점주조회 - 입력점수 이상인 친구만 출력
//			분석 - 친구들의 평균점수:85, 최고점수:90
				switch (menu) {
					case 1:		//등록
						System.out.print("이름입력>> ");
						String name = scn.nextLine();
						if(name == "") {
							System.out.println("이름을 입력해주세요");
							menu = 1;
							break;
						}
						System.out.print("몸무게입력>> ");
						double weight = Double.parseDouble(scn.nextLine());
						System.out.print("점수입력>> ");
						int score = Integer.parseInt(scn.nextLine());
						
						Friend friend = new Friend();
						friend.name = name;
						friend.weight = weight;
						friend.score = score;
						
						for(int i = 0; i < friends.length; i++) {
							if(friends[i] == null) {
								friends[i] = friend;
								break;
							}
						}
						System.out.println("정상적 입력.");
						break;
						
					case 2:		//조회
	//					전체목록..이름: 홍길동, 몸무게:77.2kg, 점수: 80점.
						for(int i = 0; i < friends.length; i++) {
							if(friends[i] != null) {
								System.out.printf(
										"이름: %s, 몸무게:%.1f, 점수: %d점.\n", 
										friends[i].name, friends[i].weight, friends[i].score
										);
							}
						}
						break;
						
					case 3:		//수정
	//					 친구이름입력 => 점수 수정
						int sScore = -1;
						double sWeight = -1;
						int cCount = 0;
						System.out.print("조회할 이름>> ");
						String cName = scn.nextLine();
						
						System.out.print("수정 몸무게>> ");
						String cWeight = scn.nextLine();
						if (!cWeight.equals("")) {
							sWeight = Double.parseDouble(cWeight);
						}else {
							System.out.println("몸무게 수정 취소");
							cCount++;
						}
						
						System.out.print("수정 점수>> ");
						String cScore = scn.nextLine();
						if (!cScore.equals("")) {
							sScore = Integer.parseInt(cScore);
						}else {
							System.out.println("점수 수정 취소");
							cCount++;
						}
						
						boolean check = true;
						for(int i = 0; i < friends.length; i++) {
							if(friends[i] != null && friends[i].name.equals(cName)) {
								friends[i].score = (sScore != -1) ? sScore : friends[i].score; 
								friends[i].weight = (sScore != -1) ? sWeight : friends[i].weight; 
								check = false;
							} 
						}
						if(check){
							System.out.println("찾는 이름이 없습니다");
							break;
						}
						if(cCount < 2) {
							System.out.println("수정 완료");
						}else {
							System.out.println("수정 취소");
						}
						break;
					case 4:		//삭제
						System.out.print("삭제할 이름>> ");
						String dName = scn.nextLine();
						
						boolean dCheck = true;
						for(int i = 0; i < friends.length; i++) {
							if(friends[i] != null && friends[i].name.equals(dName)) {
								friends[i] = null;
								dCheck = false;
								System.out.println("삭제 완료");
							}
						}
						if(dCheck){
							System.out.println("찾는 이름이 없습니다");
							break;
						}
						break;
					case 5:		//점수조회 - 입력점수 이상인 친구만 출력
						boolean checkS = false;
						System.out.print("조회할 점수>> ");
						int chScore = Integer.parseInt(scn.nextLine());
						System.out.println(chScore + "점 이상인 친구 목록");
						for(int i = 0; i < friends.length; i++) {
							if(friends[i] != null && chScore <= friends[i].score) {
								System.out.printf(
									"이름: %s, 몸무게:%.1fkg, 점수: %d점.\n", 
									friends[i].name, friends[i].weight, friends[i].score
									);
								checkS = true;
							}
						}
						if(!checkS) {
							System.out.println(chScore + "점 이상인 친구가 없습니다.");
						}
						System.out.println("조회 완료");
						break;
					case 6:		//분석 - 친구들의 평균점수:85, 최고점수:90
						double sum = 0;
						int avgC = 0;
						int max = 0;
						for(int i = 0; i < friends.length; i++) {
							if(friends[i] != null) {
								sum += friends[i].score;
								avgC++;
							}
							if(friends[i] != null && max < friends[i].score) {
								max = friends[i].score;
							}
						}
						double avg = sum/avgC;
						System.out.printf("친구들의 평균 점수:%.1f, 최고점수:%d\n조회완료\n", avg, max);
						break;
					case 9:		//종료
						run = false;
						System.out.println("프로그램을 종료합니다.");
						break;
						
					default :	//입력오류
						System.out.println("메뉴 번호가 틀렸습니다. 입력값을 확인해 주세요");
						break;
				}
			} catch (Exception e) {
				System.out.println("에러발생. 입력값을 확인해 주세요");
				continue;
			}
		}
		System.out.println("end of prog.");
	}
}

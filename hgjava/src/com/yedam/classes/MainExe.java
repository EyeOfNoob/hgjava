package com.yedam.classes;

import java.util.Scanner;

public class MainExe {
//	정적 멤버
	public static int sum(int a, int b) {
		return a + b;
	}
//	인스턴스 멤버
	public int sum2(int a, int b) {
		return a + b;
	}
	public static void test(String[] args) {
//		정적 멤버 메소드 호출
		sum(10,20);
//		인스턴스 멤버 메소드 호출
		MainExe sum3 = new MainExe();
		sum3.sum2(10,20);
	}
//	Scanner 필드를 main 메소드 밖으로 꺼냈으므로 static을 추가.
	static Scanner scn = new Scanner(System.in);
//	static 추가.
	static String sno = "", sname = "";
	static int score = 0;
	static double height = 0;
//	StudentApp의 메소드 호출을 위한 인스턴스 생성
//	StudentApp app = new StudentApp();
	
//	등록메소드
	public static void insert() {
		System.out.println("학생번호>>> ");
		sno = scn.nextLine();
		System.out.println("학생이름>>> ");
		sname = scn.nextLine();
		System.out.println("학생점수>>> ");
		score = Integer.parseInt(scn.nextLine());
		System.out.println("학생 키 >>> ");
		height = Double.parseDouble(scn.nextLine());
//		매개값으로 사용
		Student std = new Student(sno, sname, score, height);
//		입력 여부 출력
		if(StudentApp.add(std)) {
			System.out.println("입력성공!!");
		}else {
			System.out.println("입력실패!!");
		}
	} // end of insert();
	
	public static void list() {
		Student[] list = StudentApp.list();
		for(int i=0; i< list.length; i++) {
			if(list[i]!=null) {
				list[i].showInfo();
			}
		}
		System.out.println("조회완료!!");
	} // end of list();
	
	public static void update() {
		System.out.println("점수를 변경할 학생번호>>> ");
		sno = scn.nextLine();
//		정상 학번 확인.
		if(StudentApp.get(sno) == null) {
			System.out.println("학생번호 확인!!");
//			while 중단을 위해 break를 사용했으나 이제 빠져나왓으니 사용X
//			break;
//			대신 메소드 종료를 위해 return 사용
			return;
		}
//		정상점수 입력 확인.
		while (true) {
			System.out.println("변경점수>>> ");
			score = Integer.parseInt(scn.nextLine());
			if(score < 0) {
				System.out.println("점수는 0보다 커야합니다.");
				continue;
			}
			break;
		}
		
		if(StudentApp.modify(sno, score)) {
			System.out.println("수정완료!!");
		}else {
			System.out.println("잘못된 학생번호입니다!!");
		}
	} // end of update();
	
	public static void delete() {
		System.out.println("삭제할 학생번호>>> ");
		sno = scn.nextLine();
		
		if(StudentApp.remove(sno)) {
			System.out.println("삭제완료!!");
		}else {
			System.out.println("잘못된 학생번호입니다!!");
		}
	} // end of delete();
	
	public static void search() {
		System.out.println("조회할 학생번호>>> ");
		sno = scn.nextLine();
		
		Student s1 = StudentApp.get(sno);
		if(s1 !=null) {
			s1.showInfo();
		}else {
			System.out.println("잘못된 학생번호입니다!!");
		}
	} // end of search();
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 9.종료");
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("오류발생, 메뉴번호에 맞는 숫자를 입력해주세요.");
			}
			
			switch (menu) {
			case 1: //등록 기능
				insert();
				break;
			case 2: //목록 조회
				list();
				break;
			case 3: //수정
				update();
				break;
			case 4: //삭제
				delete();
				break;
			case 5: //단건조회.
				search();
				break;
			case 9: //종료.
				run = false;
				System.out.println("종료합니다!!");
				
			}
		}
		System.out.println("end of prog.");
		
	} // end of main()
}

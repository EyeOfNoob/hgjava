package com.yedam.classes;


// 학생정보관리 기능 구현.
public class StudentApp {
//	필드 선언.
	private static Student[] students; //초기값 = null인 상태.
	
//	생성자.
//	클래스 이름과 동일한 메소드(인스턴스) 생성
	public StudentApp() {
		students = new Student[10];
	}
	
//	static활용시 students = 메모리 할당.
	static {
		students = new Student[10];
	}
//	메소드.
//	기능을 담당하는 부분 생성
//	등록
	public static boolean add(Student std) {
		for (int i = 0; i < students.length; i++) {
			if(students[i]==null) {
				students[i] = std;
//				성공적으로 작동시 ture 반환
				return true;
			}
		}
//		위의 ture 반환이 안될경우 오류 발생하므로 아래와 같이 추가
//		오류 발생 이유: boolean으로 선언했으므로 반드시 
//					 true/false 중 하나가 반환되야함
		return false;
//		이 단계에서가 아니라 메소드를 호출할 클래스에서 성공여부를 출력
//		따라서 성공여부를 판단할수있게 boolean으로 선언.
//		System.out.println("입력성공!");
	}
		
//	목록조회
	public static Student[] list() {
		return students;
	}
	
//	수정.(학생번호 입력받아-점수를 수정)
	public static boolean modify(String sno, int score) {
		for(int i=0;i<students.length;i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				students[i].setScore(score);
				return true;
			}
		}
		return false;
	}
//	삭제
	public static boolean remove(String sno) {
		for(int i=0; i<students.length;i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	
//	단건조회(학생번호)
	public static Student get(String sno) {
		for(int i=0; i<students.length;i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				return students[i];
			}
		}
		return null;
	}
}
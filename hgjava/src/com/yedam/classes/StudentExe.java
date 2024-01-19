package com.yedam.classes;

// 실행용 클래스.
public class StudentExe {
	
	public static void main(String[] args) {
//		인스턴스 생성, 생성자 호출.
		Student s1 = new Student(); 
//		입력을 위해 불러올 필드변수가 현재 private로 잠겨있으므로 접근 불가능
//		s1.sno = "S001";
//		s1.sname = "홍길동";
//		s1.score = 80;
//		s1.height = -178.9;
//		따라서 아래와 같이 getter/setter메소드를 이용해 접근.
		s1.setSno("S001");
		s1.setSname("홍길동");
		s1.setScore(80);
		s1.setHeight(-178.9);
		
//		출력 역시 입력과 마찬가지.
//		System.out.println(s1.height());
		System.out.println(s1.getHeight());
		
//		System.out.println(s1.sno);
		System.out.println(s1.getSno());
		s1.showInfo();
		
		Student s2 = new Student("S002", "김길동");
//		s2.score = 85;
		s2.setScore(85);
		s2.showInfo();
		
		Student s3 = new Student("S003", "박길동", 90);
		s3.showInfo();
		
		Student s4 = new Student("S004", "김말숙", 75, 165.3);
		s4.showInfo();
	}
}

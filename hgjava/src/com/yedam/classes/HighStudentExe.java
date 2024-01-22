package com.yedam.classes;

public class HighStudentExe {
	public static void main(String[] args) {
		HighStudent hiStd = new HighStudent("T001", "홍길동", 90, "김쌤");
		
		System.out.println(hiStd.getScore());
//		자식클래스에서 생성했으므로 부모체를 상속했어도 자식체의 메소드인 get.Teacher를 호출할 수 있음.
		System.out.println(hiStd.getTeacher());
//		부모클래스의 멤버(showInfo) 사용가능.
		hiStd.showInfo();
		
		System.out.println("=======================");
//		부모클래스의 참조변수에 자식클래스의 인스턴스를 대입(할당).
//		(Student)가 생략되있음.
//		생략된 부분을 포함하면 Student std = (Student) new HighStudent("T002", "박길동", 80, "김쌤"); 이런 형태
		Student std = new HighStudent("T002", "박길동", 80, "김쌤"	);
//		자식체에서 생성했지만 부모클래스의 인스턴스에 대입(할당)되었으므로 get.Teacher를 호출할 수 없음.
//		System.out.println(std.getTeacher());
		
//		Student 타입 강제형변환
		if(std instanceof HighStudent) {
			HighStudent hstd = (HighStudent) std;
			System.out.println(hstd.getTeacher());
		}
		
		Student std1 = new Student("S003", "박석민", 80);
		if(std1 instanceof HighStudent) {
			HighStudent hstd1 = (HighStudent) std1;
			System.out.println(hstd1.getTeacher());
		}
		
		System.out.println("=======================");
		Student[] students = new Student[10];
//		HighStudent[] hiStudents = new HighStudent[10];
		
		students[0] = new Student("S001", "김민석", 90);
		students[1] = hiStd;
		for (int i = 0;i < students.length;i++) {
			if(students[i] != null) {
				students[i].showInfo();
			}
		}
		
//		자동형변환(promotion)큰범위변수 = (큰범위변수) 작은범위변수;
		long ln1 = (long) 10;
//		강제형변환(casting)
		int n1 = (int) ln1;
	}
}

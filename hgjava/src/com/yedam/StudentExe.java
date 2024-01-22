package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		
		Student std = new Student("S001", "홍길동");
		std.setScore(80);
		
//		접근수준 default(기본설정)이므로 접근불가
//		public으로 접근제한자 수정 후 접근가능
		std.showInfo(); 
		
	}
}

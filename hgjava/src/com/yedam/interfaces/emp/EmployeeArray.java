package com.yedam.interfaces.emp;

import java.util.Scanner;

// 저장방식 : 배열 Employee[]
public class EmployeeArray implements EmployeeList {
//	싱글톤 패턴으로 인스턴스생성
//	필드
	private static EmployeeArray instance = new EmployeeArray();
	Employee[] list;
	Scanner scn = new Scanner(System.in);
//	생성자
	private EmployeeArray() {
		
	}
//	메소드
	public static EmployeeArray getInstance() {
		return instance;
	}
	int empNum = 0;
	@Override
	public void init() {
//		사원수 입력 초기화
		System.out.print("사원수>> ");
		int num = scn.nextInt();
		list = new Employee[num];
		empNum = 0; //초기화
	}

	@Override
	public void input() {
//		사원 정보 입력 => 배열추가.
		if (empNum != 0 && empNum == list.length) {
			System.out.println("입력초과");
			return;
		} else if (list == null) {
			System.out.println("사원수 설정을 먼저 해주세요");
			return;
		}

		System.out.printf("현재 사원수 : %d\n사번> ", empNum);
		int no = scn.nextInt();

		System.out.print("이름> ");
		String name = scn.next();

		System.out.print("급여> ");
		int sal = scn.nextInt();

		list[empNum++] = new Employee(no, name, sal);
	
	}

	@Override
	public String search(int empId) {
//		해당사번이 있으면 이름 반환. 없으면 ".
		for (int i = 0; i < empNum; i++) {
			if (list[i] != null && list[i].getEmployeeId() == empId) {
				return list[i].getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
//		사원번호,이름,급여 출력
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
//				System.out.println("사번 : " + list[i].getEmployeeId() + ", 
//									이름 : " + list[i].getName() + ", 급여 : " + list[i].getSalary());
				System.out.printf("사번 : %d, 이름 : %s, 급여 : %d\n", 
						list[i].getEmployeeId(), list[i].getName(),	list[i].getSalary());
			}
		}
	}

	@Override
	public int sum() {
		int sSum = 0;
		for (int i = 0; i < empNum; i++) {
			if (list[i] != null) {
				sSum += list[i].getSalary();
			}
		}
		return sSum;
	}
	
}

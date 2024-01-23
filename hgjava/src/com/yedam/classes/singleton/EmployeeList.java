package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeList {
//	싱글톤.
	private static EmployeeList instance = new EmployeeList();

//	사원배열.
	Employee[] list;
//	현재 등록된 사원인원수.
	int empNum;
	Scanner scn = new Scanner(System.in);

	private EmployeeList() {
	}

	public static EmployeeList getInstance() {
		return instance;
	}

//	추가기능.
//	사원수 입력 초기화
	public void init() {
		System.out.print("사원수>> ");
		int num = scn.nextInt();
		list = new Employee[num];
		empNum = 0; //초기화
	}

//	사원 정보 입력 => 배열추가.
	public void input() {
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

//	사번에 해당하는 이름 출력.
	public String search(int empId) {
//		해당사번이 있으면 이름 반환. 없으면 ".
		for (int i = 0; i < empNum; i++) {
			if (list[i] != null && list[i].getEmployeeId() == empId) {
				return list[i].getName();
			}
		}
		return "";
	}

//	전체출력
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

//	급여합계
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

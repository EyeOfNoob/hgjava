package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

// 저장방식 : 컬렉션 ArryList<Employee>
public class EmployeeArrayList implements EmployeeList {

	private static EmployeeArrayList instance = new EmployeeArrayList();
	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);

	private EmployeeArrayList() {
	}

	public static EmployeeArrayList getInstance() {
		return instance;
	}

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		System.out.printf("현재 사원수 : %d\n사번> ", list.size());
		int no = scn.nextInt();

		System.out.print("이름> ");
		String name = scn.next();

		System.out.print("급여> ");
		int sal = scn.nextInt();

		list.add(new Employee(no, name, sal));
	}

	@Override
	public String search(int empId) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getEmployeeId() == empId) {
				return list.get(i).getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
				System.out.printf("사번 : %d, 이름 : %s, 급여 : %d\n", 
						list.get(i).getEmployeeId(), list.get(i).getName(),	list.get(i).getSalary());
		}
	}

	@Override
	public int sum() {
		int sSum = 0;
		for (int i = 0; i < list.size(); i++) {
				sSum += list.get(i).getSalary();
		}
		return sSum;
	}

}

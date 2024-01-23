package com.yedam.interfaces.emp;

import java.util.ArrayList;

public class ArrayListExe {
	public static void main(String[] args) {
//		배열(크기지정 필요)
		Employee[] employeeAry = new Employee[10];
//		배열에 추가(크기내에서의 위치(인덱스)지정 필요)
		employeeAry[0] = new Employee(101, "홍길동");
		employeeAry[1] = new Employee(102, "김민석");
		Employee emp = new Employee(103, "황인만");
		employeeAry[2] = emp;
//		삭제
		employeeAry[2] = null;

		for (int i = 0; i < employeeAry.length; i++) {
			if (employeeAry[i] != null) {
				System.out.println(employeeAry[i].getName());
			}
		}
		
		System.out.println("==============================");

//		컬렉션(크기지정 불필요-가변적)
		ArrayList<Employee> employeeAryList = new ArrayList<Employee>();
//		배열에 추가(위치지정 불필요)
		employeeAryList.add(new Employee(104, "최홍길"));
		employeeAryList.add(new Employee(105, "이만기"));
		employeeAryList.add(emp);
//		삭제(추가가 아닐경우에는 인덱스값 필요)
		employeeAryList.remove(2);

//		컬렉션에서는 length 대신 size() 사용.
		for (int i = 0; i < employeeAryList.size(); i++) {
			System.out.println(employeeAryList.get(i).getName());
		}
	}
}

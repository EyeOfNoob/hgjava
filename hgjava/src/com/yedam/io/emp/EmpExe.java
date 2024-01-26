package com.yedam.io.emp;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.print("선택>> ");

			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // "사원번호 이름 입사일자 급여" yy-MM-dd
				System.out.println("       사원번호 이름   입사일   급여");
				System.out.println("등록 예시: 101 홍길동 23-05-08 100");
				System.out.printf("입력>> ");
				String iEmp = scn.nextLine();
				String[] empAry = iEmp.split(" ");
//				Employee emp = new Employee(0, "", new Date(), 0);
				Employee emp = null;
				try {
					emp = new Employee(Integer.parseInt(empAry[0]), // 사원번호
							empAry[1], // 이름
							sdf.parse(empAry[2]), // 입사일
							Integer.parseInt(empAry[3]) // 급여
					);
				} catch (Exception e) {
					System.out.println("날짜포맷 오류.");
				}

				if (app.add(emp)) {
					System.out.println("등록완료.");
				} else {
					System.out.println("등록에러.");
				}
				break;
			case 2:
				List<Employee> list = app.list();
				for (Employee std : list) {
					System.out.println(std.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료.");
				app.save();
				run = false;
			}

		}
		System.out.println("end of prog.");

	}
}

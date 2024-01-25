package com.yedam.collection.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
//			입사일을 기준으로 조회(조회일자 이후 입사자)
			System.out.println("1.등록 2.조회(입사일자) 9.종료");
			// 문자열"23-03-01"을 Date 타입으로 바꾸는 과정 필요.
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			switch (menu) {
			case 1: // 등록
				System.out.println("        사번  이름    입사일   급여");
				System.out.println("등록 예시: 101 홍길동 23-05-08 100");
				System.out.printf(">> ");
				String emp = scn.nextLine();
				String[] empAry = emp.split(" ");
				try {
					storage.add(new Employee(Integer.parseInt(empAry[0]), // 사번
							empAry[1], // 이름
							sdf.parse(empAry[2]), // 입사일
							Integer.parseInt(empAry[3]) // 급여
					));
				} catch (Exception e) {
				}
//				System.out.println(storage);
				break;

			case 2: // 조회(입사일자)
				System.out.print("조회할 입사일>> ");
				Date countDay;
				while (true) {
					try {
						countDay = sdf.parse(scn.nextLine());
						break;
					} catch (ParseException e) {
						System.out.println("날짜 입력 오류");
					}
				}
				for (int i = 0; i < storage.size(); i++) {
					Date empDay = storage.get(i).getHireDate();
					if (empDay.after(countDay) || empDay.equals(countDay)) {
						System.out.println(storage.get(i).toString());
					}
				}
				break;
				
//				1.조회입사일 입력
//				2.배열을 반복문으로 호출
//				3.각 회원들의 입사일 호출(선언)
//				4.조건문으로 1과 3 비교
//				4-1.비교에서 조건에 해당된 회원 출력
				
//				조회할 입사일 입력
//				저장된 회원들의 입사일 호출
//				호출된 입사일과 조회할 입사일 비교 ->	조건에 맞는 회원 분류
//				Date A;
//				Date B;
//				A.after(B) => A가 B이후 날짜
//				A.before(B) => A가 B이전 날짜
//				A.equals(B) => A와 B의 날짜 동일
//				분류된 회원 출력

			case 9: // 종료
				System.out.println("시스템 종료");
				run = false;
				break;

			default:
				System.out.println("입력 오류");
				break;
			}

		}
		System.out.println("end of prog.");

	} // end of main.

//	등록기능 예시메소드
	void method() {
		// "101 홍길동 23-05-08 100"
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		String[] valAry = val.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), // 사번
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3]) // 급여
			);
		} catch (Exception e) {
		}
	} // end of method
}

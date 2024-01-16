package com.yedam.variable;

//import java.util.Iterator;
import java.util.Scanner;

public class VariableExe3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		java.util.Scanner scn = new Scanner(System.in); 
								//<== import 없이 사용하려면.
		//키입력...(=height)
		//평균(합계=sum)/3 double 타입
		double sum = 0;
		for(int i=1; i <= 3; i++) {
			System.out.println("키를 입력>>> ");
			double height = scn.nextDouble();
			sum += height;
		}
		
		
		// 세사람의 평균 키는 : 175.2 입니다.
		System.out.println("세사람의 평균 키는 : " + (sum/3) + "입니다");
		
		char c1 = 'a';
		for(int i = 0; i < 10; i++)
			System.out.println(c1++);
		
		int n1 = 0x1111;
		System.out.println(n1);
		
		scn.close();
		
	}
}
